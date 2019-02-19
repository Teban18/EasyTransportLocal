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
public class VenderPatines implements Orden{
    
     private Patines patines;

   public VenderPatines(Patines patines){
      this.patines = patines;
   }

   public void realizar() {
      patines.Vender();
   }
}
