/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import Controller.Combate;
import Controller.MundoPokemon;
import actors.PokemonAire;
import java.util.ArrayList;


/**
 *
 * @author Teban18
 */
public class probar {
    
   
    
    public static void main(String[] args) {
        
       MundoPokemon mundopokemon= new MundoPokemon();
       mundopokemon.agregarPokemonArreglo(); 
       Combate combate = new Combate();
       combate.setMundoPokemon(mundopokemon);
       combate.asignarPokemon();
       ventanaInicioPokemon vistaprincipal= new ventanaInicioPokemon();
       vistaprincipal.setCombate(combate);
       vistaprincipal.setVisible(true);
        
       
       
          
         
        
    }
}
