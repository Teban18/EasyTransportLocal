/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Implementos.BolasdeHockey;
import Implementos.Implementos;
import Implementos.Patines;
import Implementos.Stick;
import Protecciones.Protecciones;

/**
 *
 * @author Practica
 */
public class FabricaImplementos extends FabricaAbstracta {

   	
   @Override
   public Implementos getImplemento(String implemento){
   
      if(implemento == null){
         return null;
      }		
      
      if(implemento.equalsIgnoreCase("BOLASDEHOCKEY")){
         return new BolasdeHockey();
         
      }else if(implemento.equalsIgnoreCase("PATINES")){
         return new Patines();
         
      }else if(implemento.equalsIgnoreCase("STICK")){
         return new Stick();
      }
      
      return null;
   }
   
   @Override
   Protecciones getProteccion(String color) {
      return null;
   }

    
}
