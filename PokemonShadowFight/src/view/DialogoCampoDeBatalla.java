/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.applet.AudioClip;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Teban18
 */
public class DialogoCampoDeBatalla extends javax.swing.JDialog {

    /**
     * Creates new form CampoDeBatalla
     */
    private AudioClip audiobatalla;
    private int accionAliado;
    private int accionEnemigo;
    
    
    public DialogoCampoDeBatalla(java.awt.Frame parent, boolean modal, String aliado, String enemigo, int resistenciaAliado, int resistenciaEnemigo,String nombreAliado,String nombreEnemigo) {
        super(parent, modal);
        initComponents();
        ReproducirMusica();
        mostrarPokemonAliado(aliado);
        mostrarPokemonEnemigo(enemigo);
        mostrarAtaque(resistenciaAliado, resistenciaEnemigo);
        mostrarNombre(nombreAliado, nombreEnemigo);
    }

    
    private void mostrarPokemonAliado(String nombrealiado){
        
       ImageIcon Imagenpkusuario = new ImageIcon(getClass().getResource("/Aditions/"+nombrealiado+".png")) ;
       Icon fondopkusuario = new ImageIcon (Imagenpkusuario.getImage().getScaledInstance(this.lpkusuario.getHeight(), this.lpkusuario.getWidth(), Image.SCALE_DEFAULT));
       this.lpkusuario.setIcon(fondopkusuario);
       this.lpkusuario.repaint();
    }
    
    private void mostrarPokemonEnemigo(String nombreenemigo){
        
       ImageIcon Imagenpkcpu = new ImageIcon(getClass().getResource("/Aditions/"+nombreenemigo+".png")) ;
       Icon fondopkcpu = new ImageIcon (Imagenpkcpu.getImage().getScaledInstance(this.lpkcpu.getHeight(), this.lpkcpu.getWidth(), Image.SCALE_DEFAULT));
       this.lpkcpu.setIcon(fondopkcpu);
       this.lpkcpu.repaint();
    }
    
    private void ReproducirMusica(){
        
       try{
         
        audiobatalla = java.applet.Applet.newAudioClip(getClass().getResource("/Aditions/CampoDeBatalla.wav"));
        
        audiobatalla.loop();
        
           System.out.println("Reproduccion de Musica en campo de batalla correcta.");
        
         }catch(Exception e){
            e.getMessage();
        }
   }

    public int getAccionAliado() {
        return accionAliado;
    }

    public int getAccionEnemigo() {
        return accionEnemigo;
    }

    
    
    public void mostrarAtaque(int aliado,int enemigo){
        String stringAliado = String.valueOf(aliado);
        this.txtresistencia.setText(stringAliado);
        this.txtresistencia.setEnabled(false);
        String stringEnemigo = String.valueOf(enemigo);
        this.txtresistenciacpu.setText(stringEnemigo);
        this.txtresistenciacpu.setEnabled(false);
    }
    
    public void mostrarNombre(String aliado,String enemigo){
        
        this.txtnombre.setText(aliado);
        this.txtnombre.setEnabled(false);
        
        this.txtnombrecpu.setText(enemigo);
        this.txtnombrecpu.setEnabled(false);
    }
    
    
   
  
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAtacar = new javax.swing.JButton();
        BtnDefender = new javax.swing.JButton();
        BtnYoSeQUienEres = new javax.swing.JButton();
        lpkusuario = new javax.swing.JLabel();
        lpkcpu = new javax.swing.JLabel();
        txtresistenciacpu = new javax.swing.JTextField();
        txtnombrecpu = new javax.swing.JTextField();
        txtresistencia = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAtacar.setText("Atacar");
        BtnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        BtnDefender.setText("Defenderse");
        BtnDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDefenderActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDefender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, -1));

        BtnYoSeQUienEres.setText("???");
        BtnYoSeQUienEres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnYoSeQUienEresActionPerformed(evt);
            }
        });
        getContentPane().add(BtnYoSeQUienEres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));
        getContentPane().add(lpkusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 150));
        getContentPane().add(lpkcpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, 150));
        getContentPane().add(txtresistenciacpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));
        getContentPane().add(txtnombrecpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));
        getContentPane().add(txtresistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 70, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 80, -1));

        jLabel1.setText("Resistencia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel2.setText("Pokemon");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel3.setText("Resistencia");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel4.setText("Pokemon");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtacarActionPerformed
        accionAliado=0;
        accionEnemigo = (int) (Math.random()*2);
    }//GEN-LAST:event_BtnAtacarActionPerformed

    private void BtnYoSeQUienEresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnYoSeQUienEresActionPerformed

        

    }//GEN-LAST:event_BtnYoSeQUienEresActionPerformed

    private void BtnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDefenderActionPerformed
       accionAliado=1; 
       accionEnemigo = 0; 

    }//GEN-LAST:event_BtnDefenderActionPerformed

   
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtacar;
    private javax.swing.JButton BtnDefender;
    private javax.swing.JButton BtnYoSeQUienEres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lpkcpu;
    private javax.swing.JLabel lpkusuario;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrecpu;
    private javax.swing.JTextField txtresistencia;
    private javax.swing.JTextField txtresistenciacpu;
    // End of variables declaration//GEN-END:variables
}
