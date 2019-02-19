/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Implementos.Implementos;
import Protecciones.Espinilleras;
import Protecciones.Guantes;
import Protecciones.Protecciones;
import Protecciones.Rodilleras;

/**
 *
 * @author Practica
 */
public class FabricaProtecciones extends FabricaAbstracta {


   
   @Override
   public Protecciones getProteccion(String proteccion){
   
      if(proteccion == null){
         return null;
      }	
      
      if(proteccion.equalsIgnoreCase("ESPINILLERAS")){
         return new Espinilleras();
         
      }else if(proteccion.equalsIgnoreCase("GUANTES")){
         return new Guantes();
         
      }else if(proteccion.equalsIgnoreCase("RODILLERAS")){
         return new Rodilleras();
      }
      return null;
   }
   
   
   @Override
   Implementos getImplemento(String implemento) {
      return null;
   }

   
}
