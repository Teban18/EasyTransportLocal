/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.LoginController;
import java.sql.Connection;

/**
 *
 * @author Teban18
 */
public class Test {
     
    
    
    public static void main(String[] args) {
        LoginController login = new LoginController();
        login.conectar("localhost","3306","test","root","seleccion18");
        
    }
    
}
