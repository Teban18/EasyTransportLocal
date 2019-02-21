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
public class PokemontipoTierra {
    
       private int probabilidaddefensa=70;
    
    public PokemontipoTierra(String nombre, String tipo, boolean visible) {
        super(nombre, tipo, visible);
    }

    @Override
    public int ataque() {
        
        return ataque;
        
    }

    @Override
    public int getefectividad_defensa() {
        
        return probabilidaddefensa;
        
    }
}
