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
public class Administrator extends Usuario {
    
    private Sede sedeperteneciente;
    
    public Administrator(int idusuario, String nombre, String fechanacimiento, String telefono,
            Sede sedeperteneciente) {
        super(idusuario, nombre, fechanacimiento, telefono);
        this.sedeperteneciente=sedeperteneciente;
    }
    
    public void agregarUsuario(Usuario usuario){
        
    }
    
    public void consultarUsuario(Usuario usuario){
        
    }
    
    public void editarUsuario(Usuario usuario){
        
    }
    
    public void eliminarUsuario(Usuario usuario){
        
    }
    
    public void agregarCiudad(City ciudad){
        
    }
    
    public void consultarCiudad(City ciudad){
        
    }
   
    public void editarCiudad(City ciudad){
        
    }
      
    public void eliminarCiudad(City ciudad){
        
    }
  
}
