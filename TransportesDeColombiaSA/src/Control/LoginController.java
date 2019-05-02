/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BusinessLogic.User;
import Interfaces.DBconnection;

import View.LoginView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementa el metodo conectar directamente con Mysql, de igual manera .
 *
 * @author Teban18
 * @version 1.0
 * @since 1.0
 * @see mi.Controlador.ConexionBD
 */
public class LoginController {

    
    private LoginView loginview;
    private ConnectionController connection;
    private PreparedStatement sentence;
    private ResultSet result;
    
    public void setConnection(ConnectionController connection) {
        this.connection = connection;
    }
    
   
    public void log(User user){
        
        PreparedStatement sentence;
        ResultSet result;
        Connection connection = this.connection.getConnection();
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
   
   
    
    
}
