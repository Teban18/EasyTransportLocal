/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import actors.Pokemon;
import actors.PokemontipoAgua;
import actors.PokemontipoAire;
import actors.PokemontipoFuego;
import actors.PokemontipoTierra;
import java.applet.AudioClip;
import view.DialogoCampoDeBatalla;
import view.DialogoElegirPokemon;

/**
 *
 * @author Teban18
 */
public class ventanaControlador extends javax.swing.JFrame {

    private AudioClip audioinicial;
    private PokemontipoAgua pkagua;
    private PokemontipoAire pkaire;
    PokemontipoFuego pkfuego;
    PokemontipoTierra pktierra;
    Pokemon refpk;
    String nombrepk,mensajepk;
    private int resistenciainicialpk = 10;
    private int resistenciapk, probabilidaddefensa;
    DialogoElegirPokemon dialogoElegir;
    DialogoCampoDeBatalla campobatalla;

    public ventanaControlador() {
        initComponents();
        ReproducirMusica();

    }

    private void ReproducirMusica() {

        try {

            audioinicial = java.applet.Applet.newAudioClip(getClass().getResource("/Aditions/AudioInicial.wav"));

            audioinicial.loop();

            System.out.println("Reproduccion de Musica en frame principal correcta.");

        } catch (Exception e) {
            e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAvanzar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameBoy\n");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAvanzar.setBackground(new java.awt.Color(0, 0, 0));
        BtnAvanzar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnAvanzar.setForeground(new java.awt.Color(255, 204, 0));
        BtnAvanzar.setText("AVANZAR");
        BtnAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAvanzarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAvanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, -1));

        BtnSalir.setBackground(new java.awt.Color(0, 0, 0));
        BtnSalir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(255, 204, 0));
        BtnSalir.setText("SALIR");
        BtnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnSalir.setBorderPainted(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aditions/pokemon.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAvanzarActionPerformed

        ElejirPokemon();

    }//GEN-LAST:event_BtnAvanzarActionPerformed

    public void ElejirPokemon() {

        DialogoElegirPokemon dialogoElegir = new DialogoElegirPokemon(this, true);
        dialogoElegir.setVisible(true);

        System.out.println("Se ejecuta el Dialogo para Elegir Pokemon");

        

        if (dialogoElegir.obttenerEstado()) {

            if (dialogoElegir.getPokemonUsuario()== 1 || dialogoElegir.getPokemonCpu()==1) {

                pktierra = new PokemontipoTierra(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pktierra;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);

            }

            if (dialogoElegir.getPokemonUsuario()== 2 || dialogoElegir.getPokemonCpu()==2) {

                pkfuego = new PokemontipoFuego(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pkfuego;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);
            }

            if (dialogoElegir.getPokemonUsuario()== 3) {

                pktierra = new PokemontipoTierra(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pktierra;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);
            }

            if (dialogoElegir.getPokemonUsuario()== 4) {

                pkagua = new PokemontipoAgua(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pkagua;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);
            }

            if (dialogoElegir.getPokemonUsuario()== 5) {

                pkfuego = new PokemontipoFuego(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pkfuego;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);
            }

            if (dialogoElegir.getPokemonUsuario()== 6) {

                pkaire = new PokemontipoAire(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pkaire;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);
            }

            if (dialogoElegir.getPokemonUsuario()== 7) {

                pkagua = new PokemontipoAgua(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pkagua;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);

            }

            if (dialogoElegir.getPokemonUsuario()== 8) {

                pkaire = new PokemontipoAire(dialogoElegir.getNombre(), resistenciainicialpk, true);
                
                refpk = pkaire;
                nombrepk = refpk.getNombre();
                System.out.println(nombrepk);
            }

            System.out.println("Antes de entrar al metodo");
            detenerMusica();
            abrirCampoDeBatalla();

        } else {

            System.out.println("SALIÓ DEL JUEGO");

        }
    }
    
   
    
            
         


    public void abrirCampoDeBatalla() {

          if (campobatalla.getDefensa()==true){
            System.out.println("Entró al metodo defensa");   
        defensa();
        
        }
          
          if (campobatalla.getCartaYoSeQuienEres()==true){
            System.out.println("Entro al metodo yo se quien sos");
         yoSeQuienEres();   
        }
        
        resistenciapk = refpk.getResistencia();
        

        campobatalla = new DialogoCampoDeBatalla(this, true, nombrepk, nombrepk, resistenciapk, resistenciapk, mensajepk);
        campobatalla.setVisible(true);
        
        
        
        
        if (campobatalla.getAtaque()==true){
            System.out.println("Entró al metodo ataque");
        }
        
        
        
        
        

        String resistenciapkS = String.valueOf(resistenciainicialpk);
        
      
        
        System.out.println(resistenciapkS + " ->  pokemon p1 ");
        System.out.println(nombrepk + "  prueba...");
    }

    

    
    
    //Defensa calcula la probabilidad de recibir el ataque o de poderse defender
    private void defensa() {

        
            probabilidaddefensa= (int)(Math.random()*100)+1;
            
            String mostrarprobabilidaddefensa= String.valueOf(probabilidaddefensa);
            
            System.out.println("Mostrando la probabilidad de defensa  : "+mostrarprobabilidaddefensa);
            
            int efectividad = refpk.efectividad_defensa();
            
            if (probabilidaddefensa<=efectividad){
                
              resistenciapk = resistenciapk;
              
              String sedefiende = " La defensa fue exitosa, "+nombrepk+"  mantiene su resistencia intacata!" ;
              
              mensajepk= sedefiende;
              
            }else{
                
              resistenciapk = resistenciapk-1;
              
              String nosedefiende = " La defensa de "+nombrepk+"  no funcionó, se resta un punto de la resistencia" ;
              
              mensajepk= nosedefiende;
            }
        }

    
    
    
    
    
    //Metodo yo se quien eres
    private void yoSeQuienEres (){
        
        if (resistenciapk%2==0){
        int nuevaresistenciapk=resistenciapk;
        resistenciapk =nuevaresistenciapk/2;
            
    }else{
        int nuevaresistenciapk=resistenciapk;
        resistenciapk =(nuevaresistenciapk/2)+1;
    }
    
    }
    
    
    
    
    //Parar la musica
    private void detenerMusica() {
        audioinicial.stop();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAvanzar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
