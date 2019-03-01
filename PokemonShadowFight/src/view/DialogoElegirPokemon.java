/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Teban18
 */
public class DialogoElegirPokemon extends javax.swing.JDialog {

    /**
     * Creates new form DialogoIntroduccion
     */
    
    private boolean estado;
    
    public DialogoElegirPokemon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DarTitulo();
        AjustarImagen();
        
    }

    private void DarTitulo(){
        this.setTitle("GameBoy");
    }
    
    private void AjustarImagen (){
        
       ImageIcon ImagenCubone = new ImageIcon(getClass().getResource("/Aditions/Cubone.png")) ;
       Icon fondoCubone = new ImageIcon (ImagenCubone.getImage().getScaledInstance(BotonPokemon1.getHeight(), BotonPokemon1.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon1.setIcon(fondoCubone);
       BotonPokemon1.repaint();
        
       ImageIcon ImagenFlareon = new ImageIcon(getClass().getResource("/Aditions/Flareon.png")) ;
       Icon fondoFlareon = new ImageIcon (ImagenFlareon.getImage().getScaledInstance(BotonPokemon2.getHeight(), BotonPokemon2.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon2.setIcon(fondoFlareon);
       BotonPokemon2.repaint();
       
       
       ImageIcon ImagenFlygon = new ImageIcon(getClass().getResource("/Aditions/Flygon.png")) ;
       Icon fondoFlygon = new ImageIcon (ImagenFlygon.getImage().getScaledInstance(BotonPokemon3.getHeight(), BotonPokemon3.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon3.setIcon(fondoFlygon);
       BotonPokemon3.repaint();
       
       
       ImageIcon ImagenLudicolo = new ImageIcon(getClass().getResource("/Aditions/Ludicolo.png")) ;
       Icon fondoLudicolo = new ImageIcon (ImagenLudicolo.getImage().getScaledInstance(BotonPokemon4.getHeight(), BotonPokemon4.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon4.setIcon(fondoLudicolo);
       BotonPokemon4.repaint();
       
       
       ImageIcon ImagenNinetales = new ImageIcon(getClass().getResource("/Aditions/Ninetales.png")) ;
       Icon fondoNinetales = new ImageIcon (ImagenNinetales.getImage().getScaledInstance(BotonPokemon5.getHeight(), BotonPokemon5.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon5.setIcon(fondoNinetales);
       BotonPokemon5.repaint();
       
       
       ImageIcon ImagenPidgeotto = new ImageIcon(getClass().getResource("/Aditions/Pidgeotto.png")) ;
       Icon fondoPidgeotto = new ImageIcon (ImagenPidgeotto.getImage().getScaledInstance(BotonPokemon6.getHeight(), BotonPokemon6.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon6.setIcon(fondoPidgeotto);
       BotonPokemon6.repaint();
       
       
       ImageIcon ImagenQuagsire = new ImageIcon(getClass().getResource("/Aditions/Quagsire.png")) ;
       Icon fondoQuagsire = new ImageIcon (ImagenQuagsire.getImage().getScaledInstance(BotonPokemon7.getHeight(), BotonPokemon7.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon7.setIcon(fondoQuagsire);
       BotonPokemon7.repaint();
       
       
       ImageIcon ImagenSwablu = new ImageIcon(getClass().getResource("/Aditions/Swablu.png")) ;
       Icon fondoSwablu = new ImageIcon (ImagenSwablu.getImage().getScaledInstance(BotonPokemon8.getHeight(), BotonPokemon8.getWidth(), Image.SCALE_DEFAULT));
       BotonPokemon8.setIcon(fondoSwablu);
       BotonPokemon8.repaint();
       
    }
    
    private int numeropokemon;
    
    private void SetPokemon (int numeropokemon){
        this.numeropokemon=numeropokemon;
    }
    
    private String nombre;
    
    private void SetNombre (String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public int getPokemon (){
        return numeropokemon;
    }
    
     private void setEstado(boolean estado)
    {
        this.estado = estado;
    }
    
    public boolean obttenerEstado()
    {
        return this.estado;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonPokemon1 = new javax.swing.JButton();
        BotonPokemon3 = new javax.swing.JButton();
        BotonPokemon2 = new javax.swing.JButton();
        BotonPokemon4 = new javax.swing.JButton();
        BotonPokemon5 = new javax.swing.JButton();
        BotonPokemon6 = new javax.swing.JButton();
        BotonPokemon7 = new javax.swing.JButton();
        BotonPokemon8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        BotonPokemon1.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon1.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon1.setBorder(null);
        BotonPokemon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon1ActionPerformed(evt);
            }
        });

        BotonPokemon3.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon3.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon3.setBorder(null);
        BotonPokemon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon3ActionPerformed(evt);
            }
        });

        BotonPokemon2.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon2.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon2.setBorder(null);
        BotonPokemon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon2ActionPerformed(evt);
            }
        });

        BotonPokemon4.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon4.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon4.setBorder(null);
        BotonPokemon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon4ActionPerformed(evt);
            }
        });

        BotonPokemon5.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon5.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon5.setBorder(null);
        BotonPokemon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon5ActionPerformed(evt);
            }
        });

        BotonPokemon6.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon6.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon6.setBorder(null);
        BotonPokemon6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon6ActionPerformed(evt);
            }
        });

        BotonPokemon7.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon7.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon7.setBorder(null);
        BotonPokemon7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon7ActionPerformed(evt);
            }
        });

        BotonPokemon8.setBackground(new java.awt.Color(0, 0, 0));
        BotonPokemon8.setForeground(new java.awt.Color(0, 0, 0));
        BotonPokemon8.setBorder(null);
        BotonPokemon8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPokemon8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setText("Elija su Pokemon");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aditions/ElegirPokemon.gif"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("A luchar!");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(BotonPokemon4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(BotonPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonPokemon8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPokemon7, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPokemon3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPokemon6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonPokemon5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(77, 77, 77)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonPokemon6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(BotonPokemon3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonPokemon1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonPokemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonPokemon4, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(BotonPokemon5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPokemon7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonPokemon8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPokemon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon1ActionPerformed
        
        SetPokemon(1);
        SetNombre("Cubone");
    }//GEN-LAST:event_BotonPokemon1ActionPerformed

    private void BotonPokemon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon2ActionPerformed
        SetPokemon(2);
        SetNombre("Flareon");
    }//GEN-LAST:event_BotonPokemon2ActionPerformed

    private void BotonPokemon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon3ActionPerformed
    SetPokemon(3);
        SetNombre("Flygon");
    }//GEN-LAST:event_BotonPokemon3ActionPerformed

    private void BotonPokemon6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon6ActionPerformed
        SetPokemon(6);
        SetNombre("Pidgeotto");
    }//GEN-LAST:event_BotonPokemon6ActionPerformed

    private void BotonPokemon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon4ActionPerformed
        SetPokemon(4);
        SetNombre("Ludicolo");
    }//GEN-LAST:event_BotonPokemon4ActionPerformed

    private void BotonPokemon8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon8ActionPerformed
        SetPokemon(8);
        SetNombre("Swablu");
    }//GEN-LAST:event_BotonPokemon8ActionPerformed

    private void BotonPokemon7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon7ActionPerformed
        SetPokemon(7);
        SetNombre("Quagsire");
    }//GEN-LAST:event_BotonPokemon7ActionPerformed

    private void BotonPokemon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPokemon5ActionPerformed
        SetPokemon(5);
        SetNombre("Ninetales");
    }//GEN-LAST:event_BotonPokemon5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setEstado(true);
        this.dispose();
                
    }//GEN-LAST:event_jButton1ActionPerformed

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPokemon1;
    private javax.swing.JButton BotonPokemon2;
    private javax.swing.JButton BotonPokemon3;
    private javax.swing.JButton BotonPokemon4;
    private javax.swing.JButton BotonPokemon5;
    private javax.swing.JButton BotonPokemon6;
    private javax.swing.JButton BotonPokemon7;
    private javax.swing.JButton BotonPokemon8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}