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
public class User {
    
    
    protected String first_name;
    protected String last_name;
    protected String birth_date;
    protected String phone;
    protected String username;
    protected String password;
    protected String rol;
    protected String user_identification;
    protected String state;
    private String created_date;

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getCreated_date() {
        return created_date;
    }
  

    
    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setUser_identification(String user_identification) {
        this.user_identification = user_identification;
    }

    public void setState(String state) {
        this.state = state;
    }

    
    
    public String getRol() {
        return rol;
    }

    public String getUser_identification() {
        return user_identification;
    }

    public String getState() {
        return state;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    
}
