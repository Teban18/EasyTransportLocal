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
    
    
    
    
    private void setDBname(String databasename){
        this.databasename=databasename;
    }

    
    
    
    public void createDB() {
        
        try {
            
            setDBname("TransportesColombiaSA");

            sentence = connection.getConnection().prepareStatement("CREATE DATABASE IF NOT EXISTS "+ this.getDBname() );
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


            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS user(user_id SERIAL NOT NULL PRIMARY KEY,username varchar(225) NOT NULL UNIQUE,password varchar(225),islogged varchar(10))");
            sentence.executeUpdate();
            sentence.close();
            
            System.out.println("Tabla User Creada.");
            
            sentence = connection.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS user2(user2_id SERIAL NOT NULL PRIMARY KEY,username varchar(225) NOT NULL UNIQUE,password varchar(225),islogged varchar(10))");
            sentence.executeUpdate();
            sentence.close();
            
            System.out.println("Tabla User2 Creada");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public String getDBname(){
        return databasename;
    }
    
    
    
    

    
}
