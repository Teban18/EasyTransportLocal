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
import static java.lang.Math.max;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import view.ventanaInicioPokemon;

/**
 *
 * @author Teban18
 */
public class Combate {
    
    
    private MundoPokemon mundopokemon;
    private boolean ataqueAliado,ataqueEnemigo;
    Pokemon pokemon[]  = new Pokemon[2];
    
    
    public Combate(){
          
        
    }

    public void setMundoPokemon(MundoPokemon mundopokemon) {
        this.mundopokemon = mundopokemon;
    }
    
    public void asignarPokemon(){
      
      pokemon[0]=mundopokemon.entregarPokemonAlCombate();
      pokemon[1]=mundopokemon.entregarPokemonAlCombate();
      
      System.out.println(pokemon[0].getNombre());
      System.out.println(pokemon[1].getNombre());
          
  }   
     


     public Pokemon[] getPokemon() {
        return pokemon;
    }

    
    
    
   public void realizarAcciones (int accionAliado,int accionEnemigo){
       
       
       
       
       
       
       if(accionAliado==1 && accionEnemigo==1){
           
           
           
           System.out.println(getPokemon()[0].getNombre() +"  ha decidido defenserse, la resistencia no cambia ->  "+getPokemon()[0].getResistencia());
           System.out.println(getPokemon()[1].getNombre() +"  ha decidido defenserse, la resistencia no cambia ->  "+getPokemon()[1].getResistencia());
           
           validarVictoria();
           
           return;
       
       }
       
       if(accionAliado==0 && accionEnemigo==0){
           ataqueAliado = getPokemon()[0].atacar(getPokemon()[1]);
           ataqueEnemigo = getPokemon()[1].atacar(getPokemon()[0]);
           
           if(ataqueAliado){
               getPokemon()[0].setResistencia(getPokemon()[0].getResistencia()-1);
               
           }
           if(ataqueEnemigo){
               getPokemon()[1].setResistencia(getPokemon()[1].getResistencia()-1);
           }
           
           System.out.println(getPokemon()[0].getNombre()+" Ha decidido atacar, Rresistencia Pokemon aliado ->  "+getPokemon()[0].getResistencia());
           System.out.println(getPokemon()[1].getNombre()+" Ha decidido atacar, Rresistencia Pokemon enemigo ->  "+getPokemon()[1].getResistencia());
           validarVictoria();
       }
           
           if (accionAliado==1 && accionEnemigo==0){
               
               int aleatorio = ThreadLocalRandom.current().nextInt(80, 100 + 1);
               System.out.println("La probabilidad de defensa para  "+ getPokemon()[0].getNombre()+"  Es  : "+getPokemon()[0].getProbabilidaddefensa()
               + "  Y el numero aleatorio es  "+ aleatorio);
               
               if (aleatorio <= getPokemon()[0].getProbabilidaddefensa()){
                   
               ataqueAliado = getPokemon()[0].defender();
                  
               }else{
               ataqueEnemigo = getPokemon()[1].atacar(getPokemon()[0]);
               
               } 
           
           if (ataqueAliado){
               getPokemon()[0].setResistencia(getPokemon()[0].getResistencia());
                System.out.println(getPokemon()[0].getNombre()+"  Se defendió exitosamente  ->  " + getPokemon()[0].getResistencia());
               
           
           }
           if (ataqueEnemigo){
               getPokemon()[0].setResistencia(getPokemon()[0].getResistencia()-1);
               System.out.println(getPokemon()[1].getNombre()+"  atacó a  ->  "+getPokemon()[0].getNombre()+"  y su resistencia bajó a  ->  "+ getPokemon()[0].getResistencia());
           }
           
           validarVictoria();
       }
           
             if (accionAliado==0 && accionEnemigo==1){
               
               int aleatorio = (int )(Math.random()*100)+0;
               if (getPokemon()[1].getProbabilidaddefensa()<=aleatorio){
                   
               ataqueAliado = getPokemon()[1].defender();
               
               }else{
               ataqueEnemigo = getPokemon()[0].atacar(getPokemon()[1]);
               } 
           
           if (ataqueAliado){
               getPokemon()[1].setResistencia(getPokemon()[1].getResistencia());
               System.out.println(getPokemon()[1].getNombre()+"  Se defendió exitosamente" + getPokemon()[0].getResistencia());
               
           }
           if (ataqueEnemigo){
               getPokemon()[1].setResistencia(getPokemon()[1].getResistencia()-1);
               System.out.println(getPokemon()[1].getNombre()+"  recibió el ataque "+ getPokemon()[1].getResistencia());

           }
           
           System.out.println("Rresistencia Pokemon aliado ->  "+getPokemon()[1].getResistencia());
           System.out.println("Rresistencia Pokemon enemigo ->  "+getPokemon()[0].getResistencia());
           validarVictoria();
       }
      
    }
   
   
   
   public boolean validarVictoria (){
       
       if(getPokemon()[0].getResistencia()==0){
           
        System.out.println("Ganador  =" + getPokemon()[1].getNombre());
        return true;
        
       }
     
       if(getPokemon()[1].getResistencia()==0){
           
            System.out.println("Ganador  =" + getPokemon()[0].getNombre());
            return true;
            }
       
       System.out.println("Partida en curso -> no hay ganador aún");
       return false;
       
       
   }
   
   
  
  
  
   
    
}
