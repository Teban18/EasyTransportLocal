/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Protecciones;

/**
 *
 * @author diegoalejo
 */
public class Decorado implements Estado {

   public void estado(DecoradorAzul decorado) {
      System.out.println("Proteccion decorada");
      decorado.setEstado(this);	
   }

   public String toString(){
      return "Estado : [Decorado]";
   }
}
