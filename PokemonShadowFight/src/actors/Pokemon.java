/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actors;

/**
 *
 * @author Teban18
 */
public abstract class Pokemon {
    
    public final int ataque =1;
    public final int resistencia=1;
    protected String nombre;
    protected String tipo;
    protected boolean visible;
    
    public Pokemon (String nombre, String tipo, boolean visible){
        this.nombre=nombre;
        this.tipo=tipo;
        this.visible=visible;
    }
    
    public abstract int ataque();
    
    public abstract int getefectividad_defensa();
}
