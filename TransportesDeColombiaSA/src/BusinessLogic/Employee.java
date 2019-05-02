/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Teban18
 */
public class Employee extends User{
    
    private String contraseña;
    private String rol;
    
    public Employee(int idusuario, String nombre, String fechanacimiento, String telefono, String contraseña,
            String rol) {
        super(idusuario, nombre, fechanacimiento, telefono);
        
        this.contraseña=contraseña;
        this.rol=rol;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}