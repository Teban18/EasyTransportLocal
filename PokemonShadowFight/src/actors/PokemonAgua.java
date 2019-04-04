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
public class PokemonAgua extends Pokemon{

    
   private final int probabilidaddefensa=50;
   
   

    public PokemonAgua(String nombre, int Resistencia,String tipo) {
        super(nombre, Resistencia,tipo);
        arregloprobablilidades=new int[]{100,100,60,30};
    }

 
    
    
    

    public int defender() {
        setNumeroAleatorio((int)(Math.random()+100));
        if(getNumeroAleatorio()<= probabilidaddefensa & getNumeroAleatorio()>0){
            return 1;
        }else{
            if(getNumeroAleatorio()> probabilidaddefensa & getNumeroAleatorio()<= 100){
               return 0; 
            }
            return 0;
        }
    }
    
    
    
    
    @Override
    public int atacar(Pokemon pokemonenemigo) {
        
        setNumeroAleatorio((int)(Math.random()*100));
        if(getNumeroAleatorio() <= probabilidaddefensa & getNumeroAleatorio() >0){
        return 1;    
        }else{
            if(getNumeroAleatorio()> probabilidaddefensa & getNumeroAleatorio() <= 100){
             return 0;   
            }
        }
        return 0;
    }

    @Override
    public int getProbabilidadAtaque(Pokemon pokemonenemigo) {
        setTipoenemigo(pokemonenemigo.getTipo());
        switch (getTipoenemigo()){
            case "agua":
                setProbabilidadAtaque(arregloprobablilidades[0]);
            break;
            case "fuego":
                setProbabilidadAtaque(arregloprobablilidades[1]);
            break;
            case "tierra":
                setProbabilidadAtaque(arregloprobablilidades[2]);
            break;
            case "aire":
                setProbabilidadAtaque(arregloprobablilidades[3]);
            break;       
        }
        return getProbabilidadAtaque();
    }
    
   
   
    
    
}
