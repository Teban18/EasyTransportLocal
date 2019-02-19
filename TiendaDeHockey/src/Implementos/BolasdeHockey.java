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
public class BolasdeHockey implements Implementos{
 
    
    String name = "Bolas de Hockey";
    int costo= 60;
    
    @Override
    public void crear(){
        System.out.println("Creando las bolas de hockey");
    }
    
     public void Vender(){
      System.out.println("Implemento [ Nombre: "+name+" Valor : " + costo +" ] Vendido");
   }
     
}
