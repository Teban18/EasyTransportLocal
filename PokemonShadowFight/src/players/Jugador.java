/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package players;

import actors.Pokemon;

/**
 *
 * @author Teban18
 */
public abstract class Jugador {
    
    protected String nombre;
    protected boolean turno;
    
    public Jugador(String nombre, boolean turno)
    {
        this.nombre=nombre;
        this.turno=turno;
    }
    
    public abstract void ElegirPokemon(Pokemon pokemon);
    
    public String getnombre(){
        return nombre;
    }
    
    public boolean getturno(){
        return turno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    
    
}
