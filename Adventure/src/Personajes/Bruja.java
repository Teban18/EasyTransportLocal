/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import roles.FormadePelear;



/**
 *
 * @author Teban18
 */
public class Bruja extends Personaje implements FormadePelear{
    
    private Boolean Magia;
    private String Ataque="Atacando con Escoba..";
    private int npoder=80;

    public Bruja(int Codigo, String Nombre, Boolean arma, Boolean Magia) {
        super(Codigo, Nombre, arma);
        this.Magia=Magia;
    }
    
    

    @Override
    public void pelear() {
        System.out.println("Atacando con Escoba...");
    }

    
    public String getAtaqueMagia() {
        return Ataque;
    }

    
    @Override
    public void NivelPoder(int n) {
     if (n>=30 && n<=100){
         System.out.println("Nivel de poder = " + n);
     }
    }

    @Override
    public void formadePelea() {
        System.out.println("Golpeando...");
    }
    
    public void HechizoConversion(){
        System.out.println( "Hechizo de conversion" );
    }
    
    public void serInvisible(){
         System.out.println( "Ser invisible" );
    }
     
}
