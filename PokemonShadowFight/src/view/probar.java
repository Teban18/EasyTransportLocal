/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import actors.PokemontipoAire;
import java.util.ArrayList;
import players.Computadora;
import players.Jugador;
import players.Usuario;

/**
 *
 * @author Teban18
 */
public class probar {
    
    public static ArrayList<Jugador> players = new ArrayList<Jugador>();
    
    public static void main(String[] args) {
        
       ventanaInicioPokemon v1= new ventanaInicioPokemon(); 
       v1.setVisible(true);
       
        System.out.println("Ejecutando frame principal");
        
        
       
       Jugador j=new Usuario("Esteban", true);
       Jugador c=new Computadora("CPU", false);
       
       players.add(j);
       players.add(c);
       
       for (Jugador player : players ){
           
           System.out.println(player.getnombre());
       }
       
       
        
         
        
    }
}
