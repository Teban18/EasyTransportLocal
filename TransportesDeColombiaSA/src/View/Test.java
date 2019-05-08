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
       LoginController logincontroller = new LoginController();
       DBimplementation.setConnection(connection);
       logincontroller.setConnection(connection);
       
       
       LoginView loginview= new LoginView();
       MenuView menuview = new MenuView();
       ConnectionView connectionview= new ConnectionView();
       connection.setConnectionView(connectionview);
       
       
       connectionview.setConnectionController(connection);
       connectionview.setDBImplementationController(DBimplementation);
       loginview.setLogincontroller(logincontroller);
       menuview.setConnectioncontroller(connection);
       
       
       connectionview.setLoginview(loginview);
       loginview.setMenuView(menuview);
       
       
       connectionview.setVisible(true);
       connectionview.setLocationRelativeTo(null);
       
             
    }
    
}
