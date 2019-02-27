/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

/**
 *
 * @author Teban18
 */
public abstract class Personaje {
    protected Boolean arma;
    protected int codigo;
    protected String Nombre;
    
    public Personaje (int Codigo,String Nombre,Boolean arma){
        this.arma=arma;
        this.codigo=Codigo;
        this.Nombre=Nombre;
    }
    
    public abstract void pelear();
   
     public abstract void NivelPoder(int n);

    public Boolean getArma() {
        return arma;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCodigo() {
        return codigo;
    }
    
         
}
