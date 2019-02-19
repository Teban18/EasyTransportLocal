/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author diegoalejo
 */
public class FabricaMateriales {
    
      //use getShape method to get object of type shape 
   public Material getMaterial(String material){
      if(material == null){
         return null;
      }		
      if(material.equalsIgnoreCase("BOLA")){
         return new Bola();
         
      } else if(material.equalsIgnoreCase("CONO")){
         return new Cono();
         
      } else if(material.equalsIgnoreCase("PESA")){
         return new Pesa();
      }
      
      return null;
   }
}
