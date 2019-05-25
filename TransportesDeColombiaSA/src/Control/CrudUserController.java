/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BusinessLogic.Client;
import BusinessLogic.Shipment;
import BusinessLogic.User;
import View.MenuView;
import View.ShipmentView;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Teban18
 */
public class CrudUserController {
    private User user = new User();
    private ConnectionController connectioncontroller;
    ArrayList<User> userlist= new ArrayList<>();

    public void setConnectioncontroller(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }

    
    
    public void insertUser(String id, String fname, String lname, String user, String pass, String bdate, String phone, String rol, String state) {      
        this.user.setUser_identification(id);
        this.user.setFirst_name(fname);
        this.user.setLast_name(lname);
        this.user.setUsername(user);
        this.user.setPassword(pass);
        this.user.setBirth_date(bdate);
        this.user.setPhone(phone);
        this.user.setRol(rol);
        this.user.setState(state);
        try {
            String sql = "INSERT IGNORE INTO user (user_identification, first_name , last_name , username, password, birth_date, phone, rol, state )"
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connectioncontroller.getConnection().prepareStatement(sql);
            statement.setString(1, this.user.getUser_identification());
            statement.setString(2, this.user.getFirst_name());
            statement.setString(3, this.user.getLast_name());
            statement.setString(4, this.user.getUsername());
            statement.setString(5, this.user.getPassword());
            statement.setString(6, this.user.getBirth_date());
            statement.setString(7, this.user.getPhone());
            statement.setString(8, this.user.getRol());
            statement.setString(9, this.user.getState());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Nuevo Usuario registrado");
            }
        } catch (SQLException e) {
            System.out.println("No se insertó usuario"+ e.getMessage());
        }
    }
    
    
    
  public void readUser() {
        String sql = "SELECT * FROM user";
        try {
            Statement statement = connectioncontroller.getConnection().createStatement();
            ResultSet result = statement.executeQuery(sql);          
            user = null;            
            while(result.next()){                
                user= new Client();
                user.setUser_identification(result.getString("user_identification"));
                user.setFirst_name(result.getString("first_name"));
                user.setLast_name(result.getString("last_name"));
                Timestamp createddate= result.getTimestamp("create_user_date");
                user.setCreated_date(String.valueOf(createddate));                
                Date birth_date= result.getDate("birth_date");
                user.setBirth_date(String.valueOf(birth_date));
                user.setPhone(result.getString("phone"));
                user.setUsername(result.getString("username"));
                user.setPassword(result.getString("password"));
                user.setState(result.getString("state"));
                user.setRol(result.getString("rol"));
                userlist.add(user);                
            }
        } catch (SQLException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }  
    

    public ArrayList<User> getUserList() {
        return userlist;
    }

}
