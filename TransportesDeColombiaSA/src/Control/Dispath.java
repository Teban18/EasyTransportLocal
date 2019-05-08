/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import BusinessLogic.Shipment;
import BusinessLogic.User;
import View.ShipmentView;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Teban18
 */
public class Dispath {
    
    private User user;
    private ConnectionController connectioncontroller;
    
    
    public void setUser(User user){
        this.user=user;
    }

    public void setConnectioncontroller(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }
    
    
    
    public void registry(Object object){

     if (object instanceof User){
        
        /* String user_identification="'"+((User)object).getUser_identification()+"'";
         String first_name="'"+((User)object).getFirst_name()+"'";
         String last_name="'"+((User)object).getLast_name()+"'";
         String username="'"+((User)object).getUsername()+"'";
         String password="'"+((User)object).getPassword()+"'";
         String birth_date="'"+((User)object).getBirth_date()+"'";
         String phone="'"+((User)object).getPhone()+"'";
         String rol="'"+((User)object).getRol()+"'";
         String state="'"+((User)object).getState()+"'";
         */
        
         String sql= "INSERT INTO table_name (user_identification, first_name , last_name , username, password, birth_date, phone, rol, state )"
                 + "VALUES (?,?,?,?,?,?,?,?,?)";
                
         // "("+user_identification+","+first_name+","+last_name+","+username+","+password+","+birth_date+")";
         
         try{
         PreparedStatement statement= connectioncontroller.getConnection().prepareStatement(sql);
         statement.setString(1, ((User)object).getUser_identification());
         statement.setString(2, ((User)object).getFirst_name());
         statement.setString(3, ((User)object).getLast_name());
         statement.setString(4, ((User)object).getUsername());
         statement.setString(5, ((User)object).getPassword());
         statement.setString(6, ((User)object).getBirth_date());
         statement.setString(7, ((User)object).getPhone());
         statement.setString(8, ((User)object).getRol());
         statement.setString(9, ((User)object).getState());
         
         int inserted_rows= statement.executeUpdate();
         
         if (inserted_rows>0){
             System.out.println("Nuevo Usuario insertado");
         }else {
             
         }
         }catch(SQLException e){
             e.getMessage();
         }
     }   
    }
}
