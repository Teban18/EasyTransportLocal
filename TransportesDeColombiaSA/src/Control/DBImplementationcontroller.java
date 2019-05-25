/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import com.mysql.cj.MysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Teban18
 */
public class DBImplementationcontroller {

    private ConnectionController connection;
    private PreparedStatement sentence;

    public void setConnection(ConnectionController connection) {
        this.connection = connection;
    }

    

    public void createDB() {

        if(connection.getConnection()!=null){
        try {
            sentence = connection.getConnection().prepareStatement("CREATE DATABASE IF NOT EXISTS " + connection.getJsondbname());
            sentence.executeUpdate();
            sentence.close();
            connection.closeConnection();
            connection.connect(connection.getJsondbname());
            createTable();
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        }else{
            System.out.println("Conexión nula");
        }
    }

    public void createTable() {

        try {

            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS user(user_id int  NOT NULL AUTO_INCREMENT PRIMARY KEY,user_identification varchar(50) NOT NULL UNIQUE,first_name varchar (50),last_name varchar (50),username varchar(225) NOT NULL UNIQUE,password varchar(225) NOT NULL,"
                    + "create_user_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, phone varchar(30), rol varchar (20) NOT NULL,state varchar(45) NOT NULL )");
            sentence.executeUpdate();
            sentence.close();

            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS client(client_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, client_identification varchar(50) NOT NULL UNIQUE,first_name varchar (50),last_name varchar (50),"
                    + "create_client_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,birth_date varchar(30), phone varchar(30),address_client varchar(100) NOT NULL ,city_client varchar(45) NOT NULL,created_by varchar(45) NOT NULL )");
            sentence.executeUpdate();
            sentence.close();

            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS shipment(shipment_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, shipment_price varchar(20) NOT NULL, origin_city varchar (50) NOT NULL, destiny_city varchar (50) NOT NULL,"
                    + "remitter varchar(50) NOT NULL, addressee varchar(50) NOT NULL ,state varchar(45) NOT NULL ,delivered_by varchar(45) NOT NULL,create_shipment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, delivered_shipment_date varchar(50) )");
            sentence.executeUpdate();
            sentence.close();
           
            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS rol(rol_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, rol_name varchar(45) NOT NULL, state varchar (50) NOT NULL,"
                    + "create_rol_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP )");
            sentence.executeUpdate();
            sentence.close();
            
            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS city(city_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, city_name varchar(45) NOT NULL, state varchar (50) NOT NULL,"
                    + "create_city_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, department varchar(45) NOT NULL  )");
            sentence.executeUpdate();
            sentence.close();
            
            sentence= connection.getConnection().prepareStatement("INSERT IGNORE INTO user (user_identification, first_name , last_name , username, password, phone, rol, state )"
                    + "VALUES ('1026298286','Andres Esteban','Posada Rincon','a','a','3053107366','SuperUser','active') ");
    
            sentence.executeUpdate();
            sentence.close();            
           

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    

}
