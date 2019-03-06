/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import actors.Pokemon;
import actors.PokemontipoAgua;
import actors.PokemontipoAire;
import actors.PokemontipoFuego;
import actors.PokemontipoTierra;
import java.util.ArrayList;


/**
 *
 * @author Teban18
 */
public class Combate {
    
   
  
    ArrayList <Pokemon> arreglopokemon = new ArrayList<Pokemon>();
    
    public Combate (){
             
    }
    
    public void agregarPokemonArreglo(){
        
        PokemontipoAgua Quagsire= new PokemontipoAgua("Quagsire",  true);
        PokemontipoAgua Ludicolo= new PokemontipoAgua("Ludicolo",  true);
        PokemontipoFuego Flareon= new PokemontipoFuego("Flareon",true);
        PokemontipoFuego Ninetales= new PokemontipoFuego("Ninetales", true);
        PokemontipoAire Pidgeotto= new PokemontipoAire("Pidgeotto", true);
        PokemontipoAire Swablu= new PokemontipoAire("Swablu", true);
        PokemontipoTierra Cubone = new PokemontipoTierra("Cubone",  true);
        PokemontipoTierra Flygon= new PokemontipoTierra("Flygon",  true);
    
        arreglopokemon.add(Quagsire);
        arreglopokemon.add(Ludicolo);
        arreglopokemon.add(Flareon);
        arreglopokemon.add(Ninetales);
        arreglopokemon.add(Pidgeotto);
        arreglopokemon.add(Swablu);
        arreglopokemon.add(Cubone);
        arreglopokemon.add(Flygon);
    
    }
    
    
    public Pokemon entregarPokemonAlCombate(){
        
        int aleatorio = (int )(Math.random()*7)+0;
       
        return arreglopokemon.get(aleatorio);
        
        
    }
    
   
   
}


