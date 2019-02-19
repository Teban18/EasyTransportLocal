/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author diegoalejo
 */
public class Calculadora_Tarifa {
    
    
    
    public double Calculartarifa (double valorxhora, int horasServicio){
        double valortarifa = valorxhora*horasServicio;
        return valortarifa;
    }
}
