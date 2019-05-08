/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BusinessLogic.User;
import Control.ConnectionController;
import Control.DBImplementationcontroller;
import Control.LoginController;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Teban18
 */
public class ConnectionView extends javax.swing.JFrame {

    private String user_class;
    private String pass;
    private ConnectionController connectioncontroller;
    private DBImplementationcontroller dbimplementationcontroller;
    private LoginView loginview;

    public ConnectionView() {
        initComponents();

    }

    public void setLoginview(LoginView loginview) {
        this.loginview = loginview;
    }


    public void setConnectionController(ConnectionController connectioncontroller) {
        this.connectioncontroller = connectioncontroller;
    }

    public void setDBImplementationController(DBImplementationcontroller dbimplementationcontroller) {
        this.dbimplementationcontroller = dbimplementationcontroller;
    }

    
    private void setMysqlUser(String user) {
        this.user_class = user;
    }

    public String getMysqlUser() {
        return user_class;
    }

    private void setMysqlPass(String pass) {
        this.pass = pass;
    }

    public String getMysqlPass() {
        return pass;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserMysql = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpassMysql = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Conexión con la Base de datos");

        jLabel2.setText("Usuario de Mysql ");

        jLabel3.setText("Por defecto es (root)");

        jLabel4.setText("Contraseña Mysql");

        jLabel5.setText("Si no tiene no escriba nada");

        btnContinue.setText("Adelante");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpassMysql)
                            .addComponent(txtUserMysql)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpassMysql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnContinue)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed

        if (!txtUserMysql.getText().equals("")) {

            setMysqlUser(txtUserMysql.getText());
            setMysqlPass(txtpassMysql.getText());

            try {
                connectioncontroller.connect("");
                dbimplementationcontroller.createDB();

                if (connectioncontroller.getConnection() != null) {

                    this.setVisible(false);
                    showLogIn();

                } else {
                    this.setVisible(true);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas, Ingrese nuevamente los datos");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Campo usuario vacio ");
        }
    }//GEN-LAST:event_btnContinueActionPerformed

    private void showLogIn() throws SQLException {
        
        loginview.setVisible(true);
        loginview.setLocationRelativeTo(null);
        
    }

 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtUserMysql;
    private javax.swing.JTextField txtpassMysql;
    // End of variables declaration//GEN-END:variables
}
