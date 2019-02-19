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
public class Main {
    
    public static void instanciarMateriales(){
          FabricaMateriales fabricamateriales = new FabricaMateriales();

      //get an object of Circle and call its draw method.
        Material bola = fabricamateriales.getMaterial("BOLA");

      //call draw method of Circle
      bola.crear();

      //get an object of Rectangle and call its draw method.
       Material cono = fabricamateriales.getMaterial("CONO");

      //call draw method of Circle
      cono.crear();

      //get an object of Square and call its draw method.
     Material pesa = fabricamateriales.getMaterial("PESA");

      //call draw method of Circle
      pesa.crear();
   }
    
    
    public static void main(String[] args) {
      instanciarMateriales();
    }
}
