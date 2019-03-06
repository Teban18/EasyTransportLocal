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
    
    
    public int Resistencia =10;
    protected String nombre;
    protected boolean visible;
    
    public Pokemon (String nombre, boolean visible){
        this.nombre=nombre;
        this.visible=visible;
        
    }
    
    public abstract boolean atacar(Pokemon pokemon);
    public abstract boolean defender();
    
    
    
    public abstract int getProbabilidaddefensa();

    public int getResistencia() {
        return Resistencia;
    }
    
    public void setResistencia(int Resistencia){
        this.Resistencia=Resistencia;
    }
    
    public String getNombre() {
        return nombre;
    }

    

    public boolean isVisible() {
        return visible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    
}
