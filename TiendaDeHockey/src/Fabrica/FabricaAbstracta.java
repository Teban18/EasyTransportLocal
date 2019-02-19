/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica;

import Implementos.Implementos;
import Protecciones.Protecciones;

/**
 *
 * @author Practica
 */
public abstract class FabricaAbstracta {
    
   abstract Protecciones getProteccion(String implemento);
   abstract Implementos getImplemento(String implemento) ;

}
