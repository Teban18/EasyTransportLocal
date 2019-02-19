/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementos;

import Protecciones.Guantes;

/**
 *
 * @author Practica
 */
public class Fachada {
   private Implementos bhockey;
   private Implementos patines;
   private Implementos stick;

   public Fachada() {
      bhockey = new BolasdeHockey();
      patines = new Patines();
      stick = new Stick();
   }

   public void drawCircle(){
      bhockey.crear();
   }
   public void drawRectangle(){
      patines.crear();
   }
   public void drawSquare(){
      stick.crear();
   }
}
