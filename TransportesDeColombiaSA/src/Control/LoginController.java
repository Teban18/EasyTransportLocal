/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Interfaces.DBconnection;


import View.LoginView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Implementa el metodo conectar directamente con Mysql, de igual manera .
 *
 * @author Teban18
 * @version 1.0
 * @since 1.0
 * @see mi.Controlador.ConexionBD
 */
public class LoginController {

    
    
    private ConnectionController connection;
    private LoginView loginview;
    public Statement statement;
    public ResultSet result;
    private String dbusername;
    private String dbpassword;
 
    
    public void setConnection(ConnectionController connection) {
        this.connection = connection;
    }

    public void setLoginview(LoginView loginview) {
        this.loginview = loginview;
    }
   
    
   
    public void login(String username,String password){
        
        
        try {
        
        Connection connection = this.connection.getConnection();
        
        String sql= "SELECT * FROM user WHERE username='" + username + "' && password='" + password + "'";
 
        statement = connection.createStatement();
        result=statement.executeQuery(sql);
        
            
        while (result.next()) {
            
            setDbusername(result.getString("username"));
            setDbpassword(result.getString("password"));
            
     }
        
                }catch(SQLException e){
                    System.out.println("Usuario no encontrado");
                }
        
    }

    private void setDbusername(String dbusername) {
        this.dbusername = dbusername;
    }

    private void setDbpassword(String dbpassword) {
        this.dbpassword = dbpassword;
    }

    public String getDbusername() {
        return dbusername;
    }

    public String getDbpassword() {
        return dbpassword;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
   
    
    
}
