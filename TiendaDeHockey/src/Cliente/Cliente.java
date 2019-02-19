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
public class Cliente {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Cliente(String name){
      this.name  = name;
   }

   public void PedidoProtecciones(Protecciones p){
      MostrarPedidos.Mostrapedido(this,p);
   }
   
   public void PedidoImplementos (Implementos i){
      MostrarPedidos.Mostrapedidoim(this, i);
   }
}
