/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BusinessLogic.City;
import BusinessLogic.Client;
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
public class CrudClientController { 
    private Client client = new Client();
    private ConnectionController connectioncontroller;
    ArrayList<Client> clientlist= new ArrayList<>();
    
    
    public void setConnectioncontroller(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }

    public void insertClient(String id, String fname, String lname, String bdate, String phone, String address, String city,String created_by) { 
        this.client.setClient_identification(id);
        this.client.setFirst_name(fname);
        this.client.setLast_name(lname);
        this.client.setAddress(address);
        this.client.setCity(city);
        this.client.setBirth_date(bdate);
        this.client.setPhone(phone);
        this.client.setCreated_by(created_by);
        try {
            String sql = "INSERT IGNORE INTO client (client_identification, first_name , last_name , birth_date, phone, address_client, city_client, created_by )"
                    + "VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement statement = connectioncontroller.getConnection().prepareStatement(sql);
            statement.setString(1, this.client.getClient_identification());
            statement.setString(2, this.client.getFirst_name());
            statement.setString(3, this.client.getLast_name());
            statement.setString(4, this.client.getBirth_date());
            statement.setString(5, this.client.getPhone());
            statement.setString(6, this.client.getAddress());
            statement.setString(7, this.client.getCity());
            statement.setString(8, this.client.getCreated_by());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Nuevo Usuario registrado");
            }
        } catch (SQLException e) {
            System.out.println("No se insertó usuario"+ e.getMessage());
        }
    }
    
    
public void readClient() {
        String sql = "SELECT * FROM client";
        try {
            Statement statement = connectioncontroller.getConnection().createStatement();
            ResultSet result = statement.executeQuery(sql);          
            client = null;            
            while(result.next()){                
                client= new Client();
                client.setClient_identification(result.getString("client_identification"));
                client.setFirst_name(result.getString("first_name"));
                client.setLast_name(result.getString("last_name"));
                Timestamp createddate= result.getTimestamp("create_client_date");
                client.setCreated_date(String.valueOf(createddate));                
                Date birth_date= result.getDate("birth_date");
                client.setBirth_date(String.valueOf(birth_date));
                client.setPhone(result.getString("phone"));
                client.setAddress(result.getString("address_client"));
                client.setCity(result.getString("city_client"));
                client.setCreated_by(result.getString("created_by"));
                clientlist.add(client);                
            }
        } catch (SQLException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }


    public ArrayList<Client> getClientList() {
        return clientlist;
    }
}
