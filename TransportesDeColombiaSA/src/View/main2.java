/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BusinessLogic.City;
import BusinessLogic.User;
import Control.ConnectionController;
import Control.CrudUserController;
import java.awt.Menu;
import java.util.ArrayList;

/**
 *
 * @author Teban18
 */
public class main2 {
    
    private static void prueba (){
         
        ArrayList<City> clist= new ArrayList<City>();
        City city = new City();
        city.setName("Cali");
        city.setState("active");
        city.setDeparment("Valle");
        clist.add(city);
        city.setName("bogota");
        city.setState("oculto");
        city.setDeparment("bogota");
        clist.add(city);
        
        
        for (City c:clist)
		System.out.println(c.getName()+c.getState()+c.getDeparment());
         
    }
    
    public static void main(String[] args) {
        prueba();
        
    }
}
