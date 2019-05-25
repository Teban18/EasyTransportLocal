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
public class Client extends User {

    private String first_name;
    private String last_name;
    private String birth_date;
    private String phone;
    private String city;
    private String address;
    private String client_identification;
    private String created_by;
    private String created_date;

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getCreated_date() {
        return created_date;
    }
    
    

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public String getCreated_by() {
        return created_by;
    }
    
    

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClient_identification(String user_identification) {
        this.user_identification = user_identification;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getClient_identification() {
        return client_identification;
    }
    
    
    
    

   
    
    

   
   
    
    public void agregarUsuario(User usuario){
        
    }
    
    public void consultarUsuario(User usuario){
        
    }
    
    public void editarUsuario(User usuario){
        
    }
    
    public void eliminarUsuario(User usuario){
        
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
