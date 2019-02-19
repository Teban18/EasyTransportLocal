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
  
import java.util.ArrayList;
import java.util.List;

public class Vendedor {

   private List<Orden> ordenlista = new ArrayList<Orden>(); 

   public void tomarorden(Orden orden){
      ordenlista.add(orden);		
   }

   public void ponerorden(){
   
      for (Orden orden : ordenlista) {
         orden.realizar();
      }
      ordenlista.clear();
   }
 
}
