/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ConnectionController;
import Control.Crud;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Deiber
 */
public class MenuView extends javax.swing.JFrame {
    
    CityView cityview;
    ClientView clientview;
    ShipmentView shipmentview;
    UserView userview;
    RolView rolview;
    ReportView reportview;
    Crud crud;
    
    public MenuView() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
    }

    public void setCrud(Crud crud) {
        this.crud = crud;
    }
    
    public void setCityview(CityView cityview) {
        this.cityview = cityview;
    }

    public void setClientview(ClientView clientview) {
        this.clientview = clientview;
    }

    public void setShipmentview(ShipmentView shipmentview) {
        this.shipmentview = shipmentview;
    }

    public void setUserview(UserView userview) {
        this.userview = userview;
    }

    public void setRolview(RolView rolview) {
        this.rolview = rolview;
    }

    public void setReportview(ReportView reportview) {
        this.reportview = reportview;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnrol = new javax.swing.JButton();
        btncity = new javax.swing.JButton();
        btnshipment = new javax.swing.JButton();
        btnclient = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();
        btnuser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnrol.setBackground(new java.awt.Color(255, 255, 255));
        btnrol.setText("Roles");
        btnrol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrolActionPerformed(evt);
            }
        });

        btncity.setBackground(new java.awt.Color(255, 255, 255));
        btncity.setText("Ciudades");
        btncity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btncity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncityActionPerformed(evt);
            }
        });

        btnshipment.setBackground(new java.awt.Color(255, 255, 255));
        btnshipment.setText("Envíos");
        btnshipment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnshipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshipmentActionPerformed(evt);
            }
        });

        btnclient.setBackground(new java.awt.Color(255, 255, 255));
        btnclient.setText("Clientes");
        btnclient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientActionPerformed(evt);
            }
        });

        btnreport.setBackground(new java.awt.Color(255, 255, 255));
        btnreport.setText("Reportes");
        btnreport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        btnuser.setBackground(new java.awt.Color(255, 255, 255));
        btnuser.setText("Usuarios");
        btnuser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnrol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnreport, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btncity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnshipment, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnuser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnclient, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnuser, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclient, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnshipment, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncity, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnrol, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreport, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrolActionPerformed
        rolview.setVisible(true);
        rolview.setTableSets();
    }//GEN-LAST:event_btnrolActionPerformed

    private void btncityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncityActionPerformed
        cityview.setVisible(true);
        cityview.setTableSets();
    }//GEN-LAST:event_btncityActionPerformed

    private void btnshipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshipmentActionPerformed
        shipmentview.setVisible(true);
        shipmentview.setTableSets();
    }//GEN-LAST:event_btnshipmentActionPerformed

    private void btnclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientActionPerformed
        clientview.setVisible(true);
        clientview.setTableSets();
    }//GEN-LAST:event_btnclientActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        reportview.setVisible(true);
        
    }//GEN-LAST:event_btnreportActionPerformed

    private void btnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserActionPerformed
        userview.setVisible(true);
        userview.setTableSets();
    }//GEN-LAST:event_btnuserActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncity;
    private javax.swing.JButton btnclient;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btnrol;
    private javax.swing.JButton btnshipment;
    private javax.swing.JButton btnuser;
    // End of variables declaration//GEN-END:variables
}
