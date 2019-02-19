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
public class DecoradorAzul extends DecoradorProtecciones{
    

   private Estado estado;

  
   public void setEstado(Estado estado){
      this.estado = estado;		
   }

   public Estado getState(){
      return estado;
   }
   
   public DecoradorAzul(Protecciones decorateprotec) {
      super(decorateprotec);	
      estado=null;
   }

   @Override
   public void draw() {
      decorateprotec.crear();
      setBlueBorder(decorateprotec);
   }

   private void setBlueBorder(Protecciones decorateprotec){
      System.out.println("Decorado con color azul");
   }
}

