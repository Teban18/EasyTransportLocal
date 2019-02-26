/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors;

import actors.Pokemon;
import actors.PokemontipoAgua;
import actors.PokemontipoAire;
import actors.PokemontipoFuego;
import actors.PokemontipoTierra;

/**
 *
 * @author Teban18
 */
public class arenaCombate {
    
   boolean turnoUsuario = true;
   boolean turnoCPU = false;
   
   PokemontipoAgua pokemontipoagua;
   PokemontipoTierra pokemontipotierra;
   PokemontipoFuego pokemontipofuego;
   PokemontipoAire pokemontipoaire;
   
   public void calcularProbabilidadDefensa (){
       
      int numerodef = (int) (Math.random()* 100) ; 
      
      if (pokemontipofuego.efectividad_defensa() <= numerodef){
          pokemontipofuego.anularataque();
      }
           
    }
   
}
