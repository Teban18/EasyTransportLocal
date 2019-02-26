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
public class PokemontipoFuego extends Pokemon{
    
    private int probabilidaddefensa=90;
    
    PokemontipoAgua pokemontipoagua;
    PokemontipoTierra pokemontipotierra;
    PokemontipoFuego pokemontipofuego;
    PokemontipoAire pokemontipoaire;
   
    public PokemontipoFuego(String nombre, String tipo, boolean visible) {
        super(nombre, tipo, visible);
    }

    @Override
    public void atacar(Pokemon pokemon_atacado, String mensaje) {
        
       if (pokemon_atacado.equals(pokemontipoagua)){
           pokemontipoagua.setResistencia(Resistencia-1);
           System.out.println(pokemontipoagua.getResistencia() + mensaje);
       }
       
       
       
    }

    public void anularataque (){
        
        System.out.println(pokemontipofuego.getResistencia());
        
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
