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
public class PokemonTierra extends Pokemon {
    
       
    
       private final int probabilidaddefensa=70;

    public PokemonTierra(String nombre, int Resistencia,String tipo) {
        super(nombre, Resistencia,tipo);
        arregloprobablilidades=new int[]{30,60,100,100};
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
