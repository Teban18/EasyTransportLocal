/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BusinessLogic.City;
import BusinessLogic.Rol;
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
public class CrudRolController {    
    private Rol rol = new Rol();
    private ConnectionController connectioncontroller;
    ArrayList<Rol> rollist = new  ArrayList<>();

    public void setConnectioncontroller(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }

    
    
    
    public void insertRol( String rol_name, String state) {
        this.rol.setName(rol_name);
        this.rol.setState(state);        
        try {
            String sql = "INSERT IGNORE INTO rol (rol_name,state)"
                    + "VALUES (?,?)";
            PreparedStatement statement = connectioncontroller.getConnection().prepareStatement(sql);
            statement.setString(1, this.rol.getName());
            statement.setString(2, this.rol.getState());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Nueva Rol registrado");
            }
        } catch (SQLException e) {
            System.out.println("No se insertó rol"+ e.getMessage());
        }
    }    
    
    
    
    public void readRol() {
        String sql = "SELECT * FROM rol";
        try {
            Statement statement = connectioncontroller.getConnection().createStatement();
            ResultSet result = statement.executeQuery(sql);          
            rol = null;            
            while(result.next()){                
                rol= new Rol();
                rol.setName(result.getString("rol_name"));
                rol.setState(result.getString("state"));                
                Timestamp createddate= result.getTimestamp("create_rol_date");
                rol.setCreated_date(String.valueOf(createddate));                
                rollist.add(rol);                
            }
        } catch (SQLException e) {
            System.out.println("Error al crear la lectura de los datos de rol "+e.getMessage());
        }
    }

    
    
    
    public ArrayList<Rol> getRolList() {
        return rollist;
    }
    
    public void clearRolArrayList(){
        rollist.clear();
    }
}
