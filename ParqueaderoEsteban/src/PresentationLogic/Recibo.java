/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLogic;

import BusinessLogic.Calculadora_Tarifa;
import Actors.Bicicleta;
import Actors.Carro;
import Actors.Moto;

/**
 *
 * @author diegoalejo
 */
public class Recibo {
    
    Moto m;
    Carro c;
    Bicicleta b;
    
   public static void mostrarrecibo(){
       
       Frame f= new Frame();
       
       f.setVisible(true);
             
   } 
    
    public static void main(String[] args) {
       
        mostrarrecibo();
    }
 
}
