/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 * Interface la cual provee el metodo abstracto conectar el cual permite entablar conexion
 * con el gestor de base de datos. 
 * 
 * @author  Teban18
 * @version 1.0
 * @since   1.0
 */


public interface DBconnection {
    
    public abstract void connect(String dbname);
}
