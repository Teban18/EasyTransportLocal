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
public class Patines implements Implementos {
    
    String name = "Patines";
    int costo= 500;
    
    @Override
    public void crear(){
        System.out.println("Creando los Patines");
    }
    
    public void Vender(){
      System.out.println("Implemento [ Nombre: "+name+" Valor : " + costo +" ] Vendido");
   }
    
}
