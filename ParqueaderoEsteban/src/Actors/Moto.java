/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actors;

/**
 *
 * @author diegoalejo
 */
public class Moto extends Automovil{
    
       private String Color ;
       private String Placa ;
       public final double Valor_Moto_hora =1000;
    
    public Moto (String Color, String Placa){
        this.Color=Color;
        this.Placa=Placa;
    }
    
    @Override
    public double Valorxhora() {
    return Valor_Moto_hora;   
    }

       @Override
    public String getColor() {
        return Color;
    }

       @Override
    public String getPlaca() {
        return Placa;
    }

   
}
