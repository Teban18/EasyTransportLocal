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
public class City {
    
    private String name;
    private String state;
    private String deparment;
    private String creation_date;

    public City(String name, String state,String creation_date, String deparment) {
        this.name = name;
        this.state = state;
        this.deparment = deparment;
        this.creation_date=creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getDeparment() {
        return deparment;
    }
    
       
}
