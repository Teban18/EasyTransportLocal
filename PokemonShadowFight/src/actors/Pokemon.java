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
    
    
    public int Resistencia;
    protected int probabilidadAtaque;
    protected String nombre;
    protected String tipo;
    protected int[] arregloprobablilidades;
    protected int numeroAleatorio;
    protected String tipoenemigo;
    
    public Pokemon (String nombre, int Resistencia, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        this.Resistencia=Resistencia;
        arregloprobablilidades= new int[3];
    }
    
    public abstract int atacar(Pokemon pokemon);
    
    
    
    
    public abstract int defender();
    public abstract int getProbabilidadAtaque(Pokemon pokemonenemigo);

    public int[] getArregloprobablilidades() {
        return arregloprobablilidades;
    }

     public int getProbabilidadAtaque() {
        return probabilidadAtaque;
    }

    public void setProbabilidadAtaque(int probabilidadAtaque) {
        this.probabilidadAtaque = probabilidadAtaque;
    }
    
    public void setTipoenemigo(String tipoenemigo) {
        this.tipoenemigo = tipoenemigo;
    }

    public String getTipoenemigo() {
        return tipoenemigo;
    }
    
    

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public int getResistencia() {
        return Resistencia;
    }
    
    public void setResistencia(int Resistencia){
        this.Resistencia=Resistencia;
    }
    
    public String getNombre() {
        return nombre;
    }

    
    public int[] getArrayProbabilidades() {
        return getArrayProbabilidades();
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

  
    
    
}
