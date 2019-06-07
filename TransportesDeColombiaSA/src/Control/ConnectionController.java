/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaces.DBconnection;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Teban18
 */
public class ConnectionController implements DBconnection {

    private Connection connection = null;
    private String dbname="";
    private String jsonusername;
    private String jsonpassword;
    private String jsondbname;
 
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
    public void connect(String dbname) {

        JSONParser jsonparser = new JSONParser();
        try (FileReader fr = new FileReader("C:\\Users\\diegoalejo\\Documents\\NetBeansProjects\\TransportesDeColombiaSA\\src\\Json\\Credentials.json")) {
            Object object = jsonparser.parse(fr);
            JSONObject jsonobject = (JSONObject) object;
            JSONObject credentials = (JSONObject) jsonobject.get("MySqlCredentials");
            jsonusername = (String) credentials.get("Username");
            jsonpassword = (String) credentials.get("Password");
            jsondbname = (String) credentials.get("Dbname");

        } catch (FileNotFoundException e) {
            System.out.println("Error archivo" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("Error " + e.getMessage());
        }
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/" + dbname + "?&useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&zeroDateTimeBehavior=CONVERT_TO_NULL";
            connection = DriverManager.getConnection(url, jsonusername, jsonpassword);
            Class.forName(driver);
        } catch (SQLException sql) {
            System.out.println("Error de MySQL p " + sql.getMessage());
        } catch (Exception e) {
            System.out.println("Error =  " + e.getMessage());

        }

    }

    public String getJsondbname() {
        return jsondbname;
    }
    
    
    public Connection getConnection() {

        return connection;
    }

   
    public void closeConnection() {

        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
