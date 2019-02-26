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
public class PokemontipoAgua extends Pokemon{

    private int probabilidaddefensa=50;
   
    PokemontipoAgua pokemontipoagua;
    PokemontipoTierra pokemontipotierra;
    PokemontipoFuego pokemontipofuego;
    PokemontipoAire pokemontipoaire;
    
    public PokemontipoAgua(String nombre, String tipo, boolean visible) {
        super(nombre, tipo, visible);
    }

    @Override
    public void atacar(Pokemon pokemon_atacado, String mensaje) {
        
        
        
    }
    
    public void anularataque (){
        
        System.out.println(pokemontipoagua.getResistencia());
        
    }

    @Override
    public int efectividad_defensa() {
        
        return probabilidaddefensa;
        
    }

    public int getResistencia() {
        return Resistencia;
    }
    
     public void setResistencia(int Resistencia) {
        this.Resistencia = Resistencia;
    }
       

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isVisible() {
        return visible;
    }
    
    
}
