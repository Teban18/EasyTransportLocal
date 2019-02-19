/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementos;

/**
 *
 * @author diegoalejo
 */
public class VenderStick implements Orden{
    
     private Stick stick;

   public VenderStick(Stick stick){
      this.stick = stick;
   }

   public void realizar() {
      stick.Vender();
   }
}
