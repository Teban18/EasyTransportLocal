/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 * Interface la cual provee el metodo abstracto conectar el cual permite entablar conexion
 * con el gestor de base de datos. 
 * 
 * @author  Teban18
 * @version 1.0
 * @since   1.0
 */


public interface ConexionBD {
    
    public abstract void conectar(String host, String puerto, String basedatos, String usuario, String password);
}
