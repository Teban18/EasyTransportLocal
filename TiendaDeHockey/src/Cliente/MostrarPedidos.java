/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Implementos.Implementos;
import Protecciones.Protecciones;

/**
 *
 * @author diegoalejo
 */
public class MostrarPedidos {

   public static void Mostrapedido(Cliente cliente, Protecciones p){
      System.out.println( " [" + cliente.getName() + "] : " + p);
   }
    public static void Mostrapedidoim(Cliente cliente, Implementos i){
      System.out.println( " [" + cliente.getName() + "] : " + i);
   }

  
}
