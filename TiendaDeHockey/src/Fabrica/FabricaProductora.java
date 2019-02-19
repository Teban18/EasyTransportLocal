/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

/**
 *
 * @author Practica
 */
public class FabricaProductora {
 
       public static FabricaAbstracta getFabrica (String eleccion){
   
      if(eleccion.equalsIgnoreCase("PROTECCIONES")){
         return new FabricaProtecciones();
         
      }else if(eleccion.equalsIgnoreCase("IMPLEMENTOS")){
         return new FabricaImplementos();
      }
      
      return null;
   }
}
