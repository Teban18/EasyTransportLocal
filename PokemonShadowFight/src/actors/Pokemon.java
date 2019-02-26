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
    
    
    public int Resistencia=10;
    protected String nombre;
    protected String tipo;
    protected boolean visible;
    
    public Pokemon (String nombre, String tipo, boolean visible){
        this.nombre=nombre;
        this.tipo=tipo;
        this.visible=visible;
        
    }
    
    public abstract void atacar(Pokemon pokemon_atacado, String mensaje);
    
    public abstract int efectividad_defensa();

    public int getResistencia() {
        return Resistencia;
    }
    
    public void setResistencia(int Resistencia){
        this.Resistencia=Resistencia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    
}
