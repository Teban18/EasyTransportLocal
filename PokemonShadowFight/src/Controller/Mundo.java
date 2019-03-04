/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import actors.Pokemon;
import actors.PokemontipoAgua;
import actors.PokemontipoAgua;
import actors.PokemontipoAire;
import actors.PokemontipoAire;
import actors.PokemontipoFuego;
import actors.PokemontipoFuego;
import actors.PokemontipoTierra;
import actors.PokemontipoTierra;
import view.DialogoCampoDeBatalla;
import view.DialogoElegirPokemon;
import view.ventanaInicioPokemon;

/**
 *
 * @author Teban18
 */
public class Mundo {
    
   boolean turnoUsuario = true;
   boolean turnoCPU = false;
   
    private ventanaInicioPokemon ventanainicio;
    private DialogoCampoDeBatalla dialogobatalla;
    private DialogoElegirPokemon dialogoelegir;
    private Pokemon refpk;
    private int numerodefensa;
    
    public Mundo (ventanaInicioPokemon ventanainicio){
        
        this.ventanainicio=ventanainicio;
        
        
    }
    
    public void empezarVista (){
        this.ventanainicio.setVisible(true);
        
    }
    
   
   
}
