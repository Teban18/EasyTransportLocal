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
public class Reina extends Personaje implements FormadePelear{

    public Reina(int Codigo, String Nombre, Boolean arma) {
        super(Codigo, Nombre, arma);
    }

 

    @Override
    public void pelear() {
        System.out.println("Atacando con Espada...");
    }

    @Override
     public void NivelPoder(int n) {
     if (n>=30 && n<=100){
         System.out.println("Nivel de poder = " + n);
     }
    }

    @Override
    public void formadePelea() {
        System.out.println("Pegando puños..");
    }
    
}
