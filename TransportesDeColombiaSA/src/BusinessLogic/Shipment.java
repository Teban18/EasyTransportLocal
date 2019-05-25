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
public class Shipment {
    
    private String price;
    private String origin;
    private String destination;
    private String sender;
    private String addressee;
    private String state;
    private String deliveredby;
    private String created_date;
    private String delivered_date;

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public void setDelivered_date(String delivered_date) {
        this.delivered_date = delivered_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public String getDelivered_date() {
        return delivered_date;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }

    public void setState(String state) {
        this.state = state;
    }

 
    public String getPrice() {
        return price;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getSender() {
        return sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public String getState() {
        return state;
    }

   

    public void setDeliveredby(String deliveredby) {
        this.deliveredby = deliveredby;
    }

    public String getDeliveredby() {
        return deliveredby;
    }
    
    
    
}
