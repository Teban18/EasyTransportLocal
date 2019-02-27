/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Personajes.Bruja;
import Personajes.Caballero;
import Personajes.Reina;
import Personajes.Rey;
import Personajes.Trol;
import java.util.Scanner;

/**
 *
 * @author Teban18
 */
public class Mostrar {
    
    static int numero; 
    static Scanner sc=new Scanner(System.in);
    private static int eleccion;
    
    
   
    public static void main(String[] args) {
        int opcion=1;
        
        
        
      do{
          numero = (int) (Math.random() * 100) + 30;
         System.out.println("Elegir personaje");
        System.out.println("1.Bruja");
        System.out.println("2.Trol");
        System.out.println("3.Caballero");
        System.out.println("4.Rey");
        System.out.println("5.Reina");
        eleccion=sc.nextInt();
        
          if(eleccion==1){
     Bruja c1=new Bruja(1,"teresa",true,true);
        System.out.println("Bruja creada / nombre = "+c1.getNombre()+" Codigo = " +c1.getCodigo());
     System.out.println(c1.getAtaqueMagia());
     c1.NivelPoder(numero);
     c1.formadePelea();
     
        System.out.println("Como desea atacar");
        System.out.println("1. Hechizo");
        System.out.println("2. Ser Invisible");
        
        opcion= sc.nextInt();
       
        switch (opcion) {
            case 1: c1.HechizoConversion();
                    break;
            case 2: c1.serInvisible();
            break;
                    
        }
          } else if (eleccion==2){
        Trol t1=new Trol(2,"Grud",true,true);
       System.out.println("Trol creado / nombre = "+t1.getNombre()+" Codigo = " +t1.getCodigo());
     System.out.println(t1.getAtaqueMagia());
     t1.NivelPoder(numero);
     t1.formadePelea();
     
        System.out.println("Como desea atacar");
        System.out.println("1. Crear Trol");
        System.out.println("2. Ser Invisible");
        
        opcion= sc.nextInt();
       
        switch (opcion) {
            case 1: t1.crearTrol();
                    break;
            case 2: t1.serInvisible();
            break;
                    
        }
          }else if (eleccion==3){
        Caballero b1=new Caballero(3,"Esteban",true);
       System.out.println("Caballero creado / nombre = "+b1.getNombre()+" Codigo = " +b1.getCodigo());
       b1.NivelPoder(numero);
             b1.formadePelea();
          }else if(eleccion ==4){
           Rey r1=new Rey(4,"Simon el bobito",true);
       System.out.println("Rey creado / nombre = "+r1.getNombre()+" Codigo = " +r1.getCodigo());
       r1.NivelPoder(numero);
         r1.formadePelea();
          }else if(eleccion== 5){
          Reina r2=new Reina(5,"yurleidy",true);
       System.out.println("Reina creada / nombre = "+r2.getNombre()+" Codigo = " +r2.getCodigo());
       r2.NivelPoder(numero);
         r2.formadePelea();
          }
          
      }while( eleccion !=0);
      }
}
