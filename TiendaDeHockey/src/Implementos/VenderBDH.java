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
public class VenderBDH implements Orden{
    
     private BolasdeHockey bdh;

   public VenderBDH(BolasdeHockey bdh){
      this.bdh = bdh;
   }

   public void realizar() {
      bdh.Vender();
   }
}
