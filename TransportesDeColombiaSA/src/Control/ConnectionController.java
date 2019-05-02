/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaces.DBconnection;
import View.ConnectionView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Teban18
 */
public class ConnectionController implements DBconnection {

    private Connection connection = null;
    
    private ConnectionView connectionview;

    /**
     * Conecta la aplicación con el sistema gestor de base de datos, y captura
     * los errores que se puedan presentar durante la ejecución.
     *
     * @param host red a la cual está conectado
     * @param puerto Puerto utilizado por el servido de base de datos
     * @param database Nombre de la base de datos con la que se conecta
     * @param usuario Nombre del usuario predeterminado por la base de datos
     * @param password Contraseña creada en el gestor BD.
     *
     *
     * @SQLException Si alguno de los parametros de la conexion está mal,
     * informa acerca de este error
     * @ClassNotFoundException Si no se reconocen las clases asociadas a la
     * libreria de conexion
     * @Exception Otra clase de error que se presente
     *
     */
    @Override
    public void connect(String dbname, String user, String pass ) {

        try {

            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/"+dbname+"?&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

            connection = DriverManager.getConnection(url,user,pass);

            System.out.println(" conectando con la base de Datos ...");
            Class.forName(driver);

            System.out.println("Conexion Exitosa");

        } catch (SQLException sql) {
            System.out.println("Error de MySQL  " + sql.getMessage());
            System.out.println("SQLState: " + sql.getSQLState());
            System.out.println("Erro: " + sql.getErrorCode());
            System.out.println("StackTrace: " + Arrays.toString(sql.getStackTrace()));

        } catch (Exception e) {
            System.out.println("Error =  " + e.getMessage());

        }

    }

    
    
    public Connection getConnection() {
        return connection;
    }

    
    
    public void closeConnection() {
        try {
            connection.close();
            System.out.println("Se ha finalizado la conexión con Mysql");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
