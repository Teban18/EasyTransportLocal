/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Cliente.Cliente;
import Fabrica.FabricaAbstracta;
import Fabrica.FabricaProductora;
import Implementos.BolasdeHockey;
import Implementos.Fachada;
import Implementos.Implementos;
import Implementos.Patines;
import Implementos.Stick;
import Implementos.Vendedor;
import Implementos.VenderBDH;
import Implementos.VenderPatines;
import Implementos.VenderStick;
import Protecciones.Decorado;
import Protecciones.DecoradorAzul;
import Protecciones.Espinilleras;
import Protecciones.Guantes;
import Protecciones.NoDecorado;
import Protecciones.Protecciones;
import Protecciones.Rodilleras;



public class Main {
    
    public static void CrearProtecciones(){
      FabricaAbstracta Fabricaprotecciones = FabricaProductora.getFabrica("PROTECCIONES");

      
     
      
      Protecciones Guantes = new Guantes();
      
      DecoradorAzul Guantesazules = new DecoradorAzul(new Guantes());
      
      Guantesazules.draw();
      
       DecoradorAzul Espinsazules = new DecoradorAzul(new Espinilleras());
      
      Espinsazules.draw();
      
       DecoradorAzul Rodisazules = new DecoradorAzul(new Rodilleras());
      
      Rodisazules.draw();
    }
    
    
public static void CrearImplementos(){     

      FabricaAbstracta Fabricaimplementos = FabricaProductora.getFabrica("IMPLEMENTOS");

      
      Implementos patines = Fabricaimplementos.getImplemento("PATINES");

      
      patines.crear();

      
      Implementos stick = Fabricaimplementos.getImplemento("STICK");

     
      stick.crear();
      
       
      Implementos bolahockey = Fabricaimplementos.getImplemento("BOLASDEHOCKEY");

      
      bolahockey.crear();
      
    
}
 public static void CrearImplementosfacade(){
     
      Fachada fd = new Fachada();

      fd.drawCircle();
      fd.drawRectangle();
      fd.drawSquare();		
  
 }
 
 public static void CrearVenta(){
      Patines patin = new Patines();
      Stick stick = new Stick();
      BolasdeHockey bdhockey = new BolasdeHockey() {};
      
      VenderPatines ventapatinorden = new VenderPatines(patin);
      VenderStick ventastickorden = new VenderStick(stick);
      VenderBDH ventabdhorden = new VenderBDH(bdhockey);
      
      Vendedor vendedor = new Vendedor();
      vendedor.tomarorden(ventapatinorden);
      vendedor.tomarorden(ventastickorden);
      vendedor.tomarorden(ventabdhorden);

      vendedor.ponerorden();
 }
 
 public static void CrearEstado(){
      DecoradorAzul decorado = new DecoradorAzul(new Guantes());
      
      decorado.draw();
      
      Decorado decoradoestado = new Decorado();
      decoradoestado.estado(decorado);

      System.out.println(decorado.getState().toString());

      System.out.println("-------------------------");
      Guantes g = new Guantes();
      
      g.crear();
      
      NoDecorado nodecoradoestado = new NoDecorado();
      nodecoradoestado.estado(decorado);

      System.out.println(decorado.getState().toString());
 }
 
 public static void CrearPedido(){
 
     Cliente Esteban = new Cliente("Esteban");
     Cliente Miranda = new Cliente("Miranda");

      Esteban.PedidoProtecciones(new Guantes());
      Esteban.PedidoProtecciones(new Rodilleras());
      Miranda.PedidoImplementos(new Patines());
      Esteban.PedidoImplementos(new Stick());
 }
 

 
    public static void main(String[] args) {

        System.out.println("Creando Protecciones decoradas");
        CrearProtecciones();
        System.out.println("-------------------------");
        System.out.println("Creando Implementos con fabrica abstracta");
        CrearImplementos();
        System.out.println("-------------------------");
        System.out.println("Creando implementos con facade");
        CrearImplementosfacade();
        System.out.println("-------------------------");
        CrearVenta();
        System.out.println("-------------------------");
        CrearEstado();
        System.out.println("-------------------------");
        CrearPedido();
   }
}
