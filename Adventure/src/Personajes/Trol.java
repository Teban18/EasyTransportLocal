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
public class Trol extends Personaje implements FormadePelear{
    
    private Boolean Magia;
    private String Ataque="Atacando con Magia..";
    private int npoder=70;

    public Trol(int Codigo, String Nombre, Boolean arma, Boolean Magia) {
        super(Codigo, Nombre, arma);
        this.Magia=Magia;
    }
    
  

    @Override
    public void pelear() {
        System.out.println("Atacando con Cuchillo...");
    }
    
    
    public String getAtaqueMagia (){
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
        System.out.println("Golpeando el suelo con superfuerza");
    }
    
    public void crearTrol(){
        System.out.println( "Creando Trol" );
    }
    
    public void serInvisible(){
         System.out.println( "Ser invisible" );
    }
}
