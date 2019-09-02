/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import Controllers.ConnectionController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Teban18
 */
public class Query {
    private PreparedStatement preparedstatement; 
    private ResultSet rs;
            
    public void sendQueryToMysql (ConnectionController connection, String sql){
        try{
        preparedstatement = connection.getConnection().prepareStatement(sql);
        preparedstatement.executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
    }
    
    public void closeStatement(){
     try{
        preparedstatement.close();
     }catch(SQLException e){
          JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
     }
    }
    
    public void readquery(ConnectionController connection, String sql){
        try{
        Statement s = connection.getConnection().createStatement();
        rs = s.executeQuery(sql);
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
        }
        }
    
    
    
    public ResultSet getresultset(){
        return rs;
    }
        
}
