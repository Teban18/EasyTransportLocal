/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author diegoalejo
 */
public abstract class Burger implements Item{
    
     @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}
