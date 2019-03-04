/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.Mundo;
import actors.PokemontipoAire;
import java.util.ArrayList;


/**
 *
 * @author Teban18
 */
public class probar {
    
   
    
    public static void main(String[] args) {
        
       ventanaInicioPokemon v1= new ventanaInicioPokemon(); 
       
       Mundo mundopokemon =new Mundo (v1);
       
       mundopokemon.empezarVista();
       
        System.out.println("Ejecutando frame principal");    
         
        
    }
}
