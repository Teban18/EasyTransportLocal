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
    private Boolean ataque,defensa,carta;
    
    public DialogoCampoDeBatalla(java.awt.Frame parent, boolean modal, String pkusuario, String pkcpu) {
        super(parent, modal);
        initComponents();
        mostrarPk(pkusuario);
        mostrarPkCpu(pkcpu);
        ReproducirMusica();
    }

    
    private void mostrarPk(String nombrepk){
        
       ImageIcon Imagenpkusuario = new ImageIcon(getClass().getResource("/Aditions/"+nombrepk+".png")) ;
       Icon fondopkusuario = new ImageIcon (Imagenpkusuario.getImage().getScaledInstance(this.lpkusuario.getHeight(), this.lpkusuario.getWidth(), Image.SCALE_DEFAULT));
       this.lpkusuario.setIcon(fondopkusuario);
       this.lpkusuario.repaint();
    }
    
    private void mostrarPkCpu(String nombrepkcpu){
        
       ImageIcon Imagenpkcpu = new ImageIcon(getClass().getResource("/Aditions/"+nombrepkcpu+".png")) ;
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
    
    private void setAtaque (Boolean ataque){
        this.ataque=ataque;
    }
    
    public Boolean getAtaque(){
        return this.ataque;
    }
    
     private void setDefensa (Boolean defensa){
        this.defensa=defensa;
    }
    
    public Boolean getDefensa(){
        return this.defensa;
    }
    
     private void setCartaYoSeQuienEres (Boolean carta){
        this.carta=carta;
    }
    
    public Boolean getCartaYoSeQuienEres(){
        return this.carta;
    }
    
    public void setResistencia(String resistencia){
        this.txtresistencia.setText(resistencia);
        this.txtresistencia.setEnabled(false);
    }
    
    public void setNombre(String nombre){
        this.txtnombre.setText(nombre);
        this.txtnombre.setEnabled(false);
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
        setAtaque(true);
        setDefensa(false);
        setCartaYoSeQuienEres(false);
    }//GEN-LAST:event_BtnAtacarActionPerformed

    private void BtnYoSeQUienEresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnYoSeQUienEresActionPerformed

        setAtaque(false);
        setDefensa(false);
        setCartaYoSeQuienEres(true);

    }//GEN-LAST:event_BtnYoSeQUienEresActionPerformed

    private void BtnDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDefenderActionPerformed
        
        setAtaque(false);
        setDefensa(true);
        setCartaYoSeQuienEres(false);

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
