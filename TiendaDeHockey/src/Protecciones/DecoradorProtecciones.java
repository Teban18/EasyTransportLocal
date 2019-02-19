/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protecciones;

/**
 *
 * @author Practica
 */
public abstract class DecoradorProtecciones {
    
   protected Protecciones decorateprotec;

   public DecoradorProtecciones(Protecciones decorateprotec){
      this.decorateprotec = decorateprotec;
   }

   public void draw(){
      decorateprotec.crear();
   }	

}
