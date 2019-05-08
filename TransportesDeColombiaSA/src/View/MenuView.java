/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BusinessLogic.User;
import Control.ConnectionController;
import javax.swing.JOptionPane;

/**
 *
 * @author Teban18
 */
public class MenuView extends javax.swing.JFrame {

    private ConnectionController connectioncontroller;
    
    
    
    public MenuView() {
        initComponents();
        
    }

    public void setConnectioncontroller(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClient = new javax.swing.JButton();
        btnCity = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnRol = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnShipment = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClient.setText("Clientes");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnCity.setText("Ciudades");
        btnCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityActionPerformed(evt);
            }
        });

        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btnRol.setText("Roles");
        btnRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolActionPerformed(evt);
            }
        });

        btnReport.setText("Reportes");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnShipment.setText("Envíos");
        btnShipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShipmentActionPerformed(evt);
            }
        });

        btnUser.setText("Usuarios");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport)
                    .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShipment, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCity))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCity)
                .addGap(18, 18, 18)
                .addComponent(btnClient)
                .addGap(18, 18, 18)
                .addComponent(btnShipment)
                .addGap(18, 18, 18)
                .addComponent(btnUser)
                .addGap(18, 18, 18)
                .addComponent(btnRol)
                .addGap(18, 18, 18)
                .addComponent(btnReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed

        showClientView();
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityActionPerformed
        
        showCityView();
    }//GEN-LAST:event_btnCityActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        showLogOutView();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolActionPerformed

        showRolView();
    }//GEN-LAST:event_btnRolActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed

        showReportView();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShipmentActionPerformed

        showShipmentView();
    }//GEN-LAST:event_btnShipmentActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed

        showUserView();
    }//GEN-LAST:event_btnUserActionPerformed

    private void showCityView() {
        CityView cityview = new CityView(this, true);
        cityview.setVisible(true);
        cityview.setLocationByPlatform(true);
    }

    private void showClientView() {
        ClientView clientview = new ClientView(this, true);
        clientview.setVisible(true);
        clientview.setLocationRelativeTo(this);
    }

    private void showShipmentView() {
        ShipmentView shipmentview = new ShipmentView(this, true);
        shipmentview.setVisible(true);
        shipmentview.setLocationRelativeTo(null);
    }

    private void showUserView() {
        UserView userview = new UserView(this, true);
        userview.setVisible(true);
        userview.setLocationRelativeTo(null);
    }

    private void showRolView() {
        RolView rolview = new RolView(this, true);
        rolview.setVisible(true);
        rolview.setLocationRelativeTo(null);
    }

    private void showReportView() {
        ReportView reportview = new ReportView(this, true);
        reportview.setVisible(true);
        reportview.setLocationRelativeTo(null);
    }

    private void showLogOutView() {
        LogOutView logoutview = new LogOutView(this, true, connectioncontroller);
        logoutview.setVisible(true);
        logoutview.setLocationRelativeTo(null);
      
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCity;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnRol;
    private javax.swing.JButton btnShipment;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables
}
