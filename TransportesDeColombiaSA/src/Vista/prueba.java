/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Login;

/**
 *
 * @author Teban18
 */
public class prueba {
    
    
    
    public static void main(String[] args) {
        Login login = new Login();
        login.conectar("localhost","3306","transporteprueba","root","seleccion18");
    }
    
}
