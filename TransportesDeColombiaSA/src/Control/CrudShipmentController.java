/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BusinessLogic.Client;
import BusinessLogic.Shipment;
import BusinessLogic.User;
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
public class CrudShipmentController {

    private Shipment shipment = new Shipment();
    private ConnectionController connectioncontroller;
    ArrayList<Shipment> shipmentlist= new ArrayList<>();

    public void setConnectioncontroller(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }

    public void insertShipment(String price, String origin, String destination, String sender, String addressee, String state, String deliveredby) {
        this.shipment.setPrice(price);
        this.shipment.setOrigin(origin);
        this.shipment.setDestination(destination);
        this.shipment.setSender(sender);
        this.shipment.setAddressee(addressee);
        this.shipment.setState(state);
        this.shipment.setDeliveredby(deliveredby);        
        try {           
            String sql = "INSERT IGNORE INTO shipment (shipment_price, origin_city , destiny_city , remitter,addressee, state, delivered_by )"
                    + "VALUES (?,?,?,?,?,?,?)";
            PreparedStatement statement = connectioncontroller.getConnection().prepareStatement(sql);
            statement.setString(1, this.shipment.getPrice());
            statement.setString(2, this.shipment.getOrigin());
            statement.setString(3, this.shipment.getDestination());
            statement.setString(4, this.shipment.getSender());
            statement.setString(5, this.shipment.getAddressee());
            statement.setString(6, this.shipment.getState());
            statement.setString(7, this.shipment.getDeliveredby());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Nuevo Envío registrado");
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Ingrese los valores requeridos" + e.getMessage());
        }
    }      
        
        public void readShipment() {
        String sql = "SELECT * FROM shipment";
        try {
            Statement statement = connectioncontroller.getConnection().createStatement();
            ResultSet result = statement.executeQuery(sql);          
            shipment = null;            
            while(result.next()){                
                shipment= new Shipment();
                shipment.setPrice(result.getString("shipment_price"));
                shipment.setOrigin(result.getString("origin_city"));
                shipment.setDestination(result.getString("destiny_city"));
                shipment.setSender(result.getString("remitter"));
                shipment.setAddressee(result.getString("addressee"));
                shipment.setState(result.getString("state"));
                shipment.setDeliveredby(result.getString("delivered_by"));
                String screated_date= result.getString("create_shipment_date");
                shipment.setCreated_date(String.valueOf(screated_date));
                String sdelivered_date= result.getString("delivered_shipment_date");
                shipment.setDelivered_date(sdelivered_date); 
                shipmentlist.add(shipment);                
            }
        } catch (SQLException e) {
            System.out.println("Error : "+e.getMessage());
        }
    }

    public ArrayList<Shipment> getShipmentlist() {
        return shipmentlist;
    }
        
                
    }

