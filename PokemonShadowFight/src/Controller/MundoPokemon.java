/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import actors.Pokemon;
import actors.PokemonAgua;
import actors.PokemonAire;
import actors.PokemonFuego;
import actors.PokemonTierra;
import java.util.ArrayList;


/**
 *
 * @author Teban18
 */
public class MundoPokemon {
    
   
  
    ArrayList <Pokemon> arreglopokemon = new ArrayList<Pokemon>();
    
    public MundoPokemon (){
             
    }
    
    public void agregarPokemonArreglo(){
        
        PokemonAgua Quagsire= new PokemonAgua("Quagsire", 10, "agua");
        PokemonAgua Ludicolo= new PokemonAgua("Ludicolo",  10, "agua");
        PokemonFuego Flareon= new PokemonFuego("Flareon",10, "fuego");
        PokemonFuego Ninetales= new PokemonFuego("Ninetales", 10,"fuego");
        PokemonAire Pidgeotto= new PokemonAire("Pidgeotto", 10,"aire");
        PokemonAire Swablu= new PokemonAire("Swablu", 10,"aire");
        PokemonTierra Cubone = new PokemonTierra("Cubone",  10,"tierra");
        PokemonTierra Flygon= new PokemonTierra("Flygon",  10,"tierra");
    
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


