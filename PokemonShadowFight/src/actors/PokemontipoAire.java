/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors;

/**
 *
 * @author Teban18
 */
public class PokemontipoAire extends Pokemon {
    
       private final int probabilidaddefensa=60;
    
    
    public PokemontipoAire(String nombre,  boolean visible) {
        super(nombre, visible);
    }

    public int getProbabilidaddefensa() {
        return probabilidaddefensa;
    }

  
    
  

    @Override
    public boolean atacar(Pokemon pokemon) {
        
        return true;
    }

    @Override
    public boolean defender() {
       return true;
    }
}
