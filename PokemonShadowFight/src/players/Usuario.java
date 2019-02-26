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
public class Usuario extends Jugador {

    
    public Usuario(String nombre, boolean turno) {
        super(nombre, turno);
    }

    @Override
    public void ElegirPokemon(Pokemon pokemon) {
        System.out.println(pokemon);    
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    
   
}
