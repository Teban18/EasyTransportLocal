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
public class Client extends User{
    
    private String direccion;
    private String ciudad;
    
    public Client(int idusuario, String nombre, String fechanacimiento, String telefono, String direccion
    , String ciudad) {
        super(idusuario, nombre, fechanacimiento, telefono);
        this.direccion=direccion;
        this.ciudad=ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
    
    
}
