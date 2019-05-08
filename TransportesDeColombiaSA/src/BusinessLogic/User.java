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
    
    protected int user_id;
    protected String first_name;
    protected String last_name;
    protected String birth_date;
    protected String creation_date;
    protected String phone;
    protected String username;
    protected String password;
    protected String rol;
    protected String user_identification;
    protected String state;
    
    public User(int user_id, String user_identification, String first_name, String last_name ,String username, String password , String creation_date, String birth_date , String phone, String rol, String state){
        this.user_id=user_id;
        this.first_name=first_name;
        this.last_name=last_name;
        this.username=username;
        this.password=password;
        this.birth_date=birth_date;
        this.creation_date=creation_date;
        this.phone=phone;
        this.rol=rol;
        this.user_identification=user_identification;
        this.state=state;
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

    
    
    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public int getUser_id() {
        return user_id;
    }

    public String getFirst_name() {
        return "hola gonorrea";
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
