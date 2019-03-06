/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import Controller.MundoPokemon;
import Controller.Combate;
import actors.PokemontipoAire;
import java.util.ArrayList;


/**
 *
 * @author Teban18
 */
public class probar {
    
   
    
    public static void main(String[] args) {
        
       Combate combate= new Combate();
       combate.agregarPokemonArreglo(); 
       MundoPokemon mundoPokemon = new MundoPokemon();
       mundoPokemon.setCombate(combate);
       mundoPokemon.asignarPokemon();
       ventanaInicioPokemon vistaprincipal= new ventanaInicioPokemon();
       vistaprincipal.setMundoPokemon(mundoPokemon);
       vistaprincipal.setVisible(true);
       
       
          
         
        
    }
}
