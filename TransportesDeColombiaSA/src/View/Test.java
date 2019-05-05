/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ConnectionController;
import Control.DBImplementationcontroller;
import Control.LoginController;
import java.sql.Connection;

/**
 *
 * @author Teban18
 */
public class Test {
     
    
    
    public static void main(String[] args) { 
       ConnectionController connection= new ConnectionController();
       DBImplementationcontroller DBimplementation = new DBImplementationcontroller();
       DBimplementation.setConnection(connection);
       ConnectionView connectionview= new ConnectionView();
       connectionview.setConnectionController(connection);
       connectionview.setDBImplementationController(DBimplementation);
       connection.setConnectionView(connectionview);
       connectionview.setVisible(true); 
             
    }
    
}
