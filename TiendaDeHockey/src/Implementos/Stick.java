/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementos;

/**
 *
 * @author Practica
 */
public class Stick implements  Implementos{
   
    String name = "Stick de Hockey";
    int costo= 200;
    
    @Override
    public void crear(){
        System.out.println("Creando los Sticks");
    }
    
     public void Vender(){
      System.out.println("Implemento [ Nombre: "+name+" Valor : " + costo +" ] Vendido");
   }
}
