/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Teban18
 */
public class Menu extends javax.swing.JDialog {

    /**
     * Creates new form CurrentMenu
     */
    public Menu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        btnRol = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnShipment = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnCity = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton7.setText("Logout");

        btnRol.setText("Roles");

        btnReport.setText("Reportes");

        btnShipment.setText("Envíos");
        btnShipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShipmentActionPerformed(evt);
            }
        });

        btnUser.setText("Usuarios");

        btnClient.setText("Clientes");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnCity.setText("Ciudades");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReport)
                    .addComponent(btnRol, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShipment, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShipmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShipmentActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientActionPerformed


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
