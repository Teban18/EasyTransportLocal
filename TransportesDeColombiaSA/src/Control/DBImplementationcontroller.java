/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.ConnectionView;
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
    private String databasename;
    private PreparedStatement sentence;
    private ResultSet result;

    public void setConnection(ConnectionController connection) {
        this.connection = connection;
    }

    private void setDBname(String databasename) {
        this.databasename = databasename;
    }

    public void createDB() {

        try {

            setDBname("TransportesColombiaSA");

            sentence = connection.getConnection().prepareStatement("CREATE DATABASE IF NOT EXISTS " + this.getDBname());
            sentence.executeUpdate();
            sentence.close();
            connection.closeConnection();
            connection.connect(this.getDBname());
            System.out.println("Base de datos creada ");
            createTable();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void createTable() {

        try {

            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS user(user_id int  NOT NULL AUTO_INCREMENT PRIMARY KEY,user_identification varchar(50) NOT NULL UNIQUE,first_name varchar (50),last_name varchar (50),username varchar(225) NOT NULL UNIQUE,password varchar(225),"
                    + "create_user_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,birth_date DATE, phone varchar(30), rol varchar (20),state varchar(45), deleted BOOLEAN, deleted_by varchar (255) NOT NULL, deleted_when DATE )");
            sentence.executeUpdate();
            sentence.close();

            System.out.println("Table User ready.");

            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS client(client_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, client_identification varchar(50) NOT NULL UNIQUE,first_name varchar (50),last_name varchar (50),"
                    + "create_client_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,birth_date DATE, phone varchar(30),address_client varchar(100) NOT NULL ,city_client varchar(45),created_by varchar(45), deleted BOOLEAN, deleted_by varchar (255) NOT NULL, deleted_when DATE )");
            sentence.executeUpdate();
            sentence.close();

            System.out.println("Table Client ready.");

            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS shipment(shipment_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, shipment_price int NOT NULL, origin_city varchar (50), destiny_city varchar (50),"
                    + "remitter varchar(50) NOT NULL, addressee varchar(50) NOT NULL ,state_shipment varchar(40),delivered_by varchar(45),create_shipment_date DATE , delivery_date DATE, deleted BOOLEAN, deleted_by varchar (255) NOT NULL, deleted_when DATE )");
            sentence.executeUpdate();
            sentence.close();

            System.out.println("Table Shipment ready.");
           
            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS rol(rol_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, rol_name varchar(45), state varchar (50),"
                    + "create_rol_date DATE , deleted BOOLEAN, deleted_by varchar (255) NOT NULL, deleted_when DATE )");
            sentence.executeUpdate();
            sentence.close();

            System.out.println("Table rol ready.");
            
            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS city(city_id int NOT NULL AUTO_INCREMENT PRIMARY KEY, city_name varchar(45), state varchar (50),"
                    + "create_city_date DATE , deparment varchar(45) NOT NULL , deleted BOOLEAN, deleted_by varchar (255) NOT NULL, deleted_when DATE )");
            sentence.executeUpdate();
            sentence.close();

            System.out.println("Table city ready.");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public String getDBname() {
        return databasename;
    }

}
