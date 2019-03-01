/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.applet.AudioClip;

/**
 *
 * @author Teban18
 */
public class ventanaInicioPokemon extends javax.swing.JFrame {

    private AudioClip audioinicial;
    
    public ventanaInicioPokemon() {
        initComponents();
        ReproducirMusica();
      
    }

   private void ReproducirMusica(){
        
       try{
         
        audioinicial = java.applet.Applet.newAudioClip(getClass().getResource("/Aditions/AudioInicial.wav"));
        
        audioinicial.loop();
        
           System.out.println("Reproduccion de Musica en frame principal correcta.");
        
         }catch(Exception e){
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

    public void ElejirPokemon (){
         
        DialogoElegirPokemon dialogoElegir = new DialogoElegirPokemon(this, true);
        dialogoElegir.setVisible(true);
        
        System.out.println("Se ejecuta el Dialogo para Elegir Pokemon");
        
        if (dialogoElegir.obttenerEstado()){
        
        if(dialogoElegir.getPokemon()==1){
            System.out.println(dialogoElegir.getNombre());
        }
        
        if (dialogoElegir.getPokemon()==2){
            System.out.println(dialogoElegir.getNombre());
        }
        
        if (dialogoElegir.getPokemon()==3){
            System.out.println(dialogoElegir.getNombre());
        }
        
        if (dialogoElegir.getPokemon()==4){
            System.out.println(dialogoElegir.getNombre());
        }
        
        if (dialogoElegir.getPokemon()==5){
            System.out.println(dialogoElegir.getNombre());
        }
        
        if (dialogoElegir.getPokemon()==6){
            System.out.println(dialogoElegir.getNombre());
        }
        
        if (dialogoElegir.getPokemon()==7){
            System.out.println(dialogoElegir.getNombre());
        
        }
        
        if (dialogoElegir.getPokemon()==8){
            System.out.println(dialogoElegir.getNombre());
    }
        
        abrirCampoDeBatalla();
        
        }else {
            
            System.out.println("SALIÓ DEL JUEGO");
            
        }
    }
        public void abrirCampoDeBatalla(){
           
        DialogoCampoDeBatalla campoDeBatalla = new DialogoCampoDeBatalla(this, true);
        campoDeBatalla.setVisible(true); 
        }
    
   
    
   
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAvanzar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}