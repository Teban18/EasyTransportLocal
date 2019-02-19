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
public class Bicicleta extends Automovil{

    private String Color ;
    private String Placa ;
    public double Valor_Bici_hora= 600;
    
    public Bicicleta (String Color, String Placa){
        this.Color=Color;
        this.Placa=Placa;
    }
    
    @Override
    public double Valorxhora() {
    return Valor_Bici_hora;   
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
