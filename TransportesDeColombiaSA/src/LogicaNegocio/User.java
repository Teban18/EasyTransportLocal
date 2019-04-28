/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author Teban18
 */
public abstract class User {
    
    protected int idusuario;
    protected String nombre;
    protected String fechanacimiento;
    protected String telefono;
    
    public User(int idusuario, String nombre, String fechanacimiento, String telefono){
        this.idusuario=idusuario;
        this.nombre=nombre;
        this.fechanacimiento=fechanacimiento;
        this.telefono=telefono;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
