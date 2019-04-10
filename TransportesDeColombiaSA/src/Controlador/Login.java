/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Implementa el metodo conectar directamente con Mysql, de igual manera .
 * 
 * @author  Teban18
 * @version 1.0
 * @since   1.0
 * @see     mi.Controlador.ConexionBD
 */


public class Login implements ConexionBD{

    
    
    /**
 * Conecta la aplicación con el sistema gestor de base de datos, y captura los errores que se puedan presentar
 * durante la ejecución.
 *
 * @param     host   red a la cual está conectado
 * @param     puerto  Puerto utilizado por el servido de base de datos
 * @param     database Nombre de la base de datos con la que se conecta
 * @param     usuario Nombre del usuario predeterminado por la base de datos
 * @param     password Contraseña creada en el gestor BD.
 * 
 * 
 * @SQLException
 *            Si alguno de los parametros de la conexion está mal, informa acerca de este error
 * @ClassNotFoundException
 *            Si no se reconocen las clases asociadas a la libreria de conexion
 * @Exception
 *            Otra clase de error que se presente  
 * 
 */
    
    
    @Override
    public void conectar(String host, String puerto, String database, String usuario, String password) {
        
        
        
        String driver="com.mysql.cj.jdbc.Driver";
        String url= "jdbc:mysql://" + host + ":" + puerto + "/" + database+"?autoReconnect=true&useSSL=false";
        
        Connection connection = null;
        
        try {
            System.out.println("Tratando de conectar con la base de Datos");
            Class.forName(driver).newInstance();
            
            
             connection= DriverManager.getConnection(url,usuario,password);
             System.out.println("Conexion Exitosa");
            
        }catch (SQLException e){
            System.out.println("Error de MySQL"+e.getMessage());
            
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            
        } catch (Exception e) {
            System.out.println("Error =  "+ e.getMessage());
        
        }
        
    }
    
}
