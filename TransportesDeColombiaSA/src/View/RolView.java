/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.CrudController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Teban18
 */
public class RolView extends javax.swing.JFrame {
    private DefaultTableModel model;
    private ArrayList<String> columns = new ArrayList<String>();
    private ArrayList<String> values;
    private CrudController crud;
    private String rolname = "rol";
    private String rolid = "rol_id";
  
    public RolView() {
        initComponents();
        columns.add("rol_name");
        columns.add("state");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         showdefaultbtnvalues(false);
    }

    private void showdefaultbtnvalues(boolean status){
       boolean insertstatus= true;
        if(status){
           insertstatus= false;
       }
        btnDelete.setVisible(status);
         btnupdate.setVisible(status);
         btninsert.setVisible(insertstatus);
    }
    
    public void setCrud(CrudController crud) {
        this.crud = crud;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roltable = new javax.swing.JTable();
        btnRead = new javax.swing.JToggleButton();
        txtsearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        txtstate = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel4.setText("Estado");

        jLabel1.setText("Rol");

        roltable.setAutoCreateRowSorter(true);
        roltable.setBackground(new java.awt.Color(255, 255, 255));
        roltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        roltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(roltable);

        btnRead.setText("Buscar");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        jLabel2.setText("Busqueda por ID");

        btninsert.setText("Agregar");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setText("Editar");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel3.setText("NombreRol");

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addComponent(txtsearch))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninsert, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btnRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnRead))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roltableMouseClicked
        int i = roltable.getSelectedRow();
        txtname.setText((String) roltable.getModel().getValueAt(i, 1));
        txtstate.setText((String) roltable.getModel().getValueAt(i, 2));  
        if(i!=-1){
            showdefaultbtnvalues(true);
        }       
    }//GEN-LAST:event_roltableMouseClicked

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
      searchrow();
    }//GEN-LAST:event_btnReadActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        try {
            values = new ArrayList<String>();
            values.add(txtname.getText());
            values.add(txtstate.getText());
            crud.createstatement(rolname, columns, values);
            setTableSets();
            clearTxt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            if (roltable.getSelectedRow() != -1) {
                int i = roltable.getSelectedRow();
                int idvalue = (int) roltable.getModel().getValueAt(i, 0);
                ArrayList<String> thisvalues = new ArrayList<String>();
                thisvalues.add(txtname.getText());
                thisvalues.add(txtstate.getText());
                crud.updatestatement(rolname, columns, thisvalues, rolid, idvalue);
                setTableSets();
                clearTxt();
                showdefaultbtnvalues(false);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if (roltable.getSelectedRow() != -1) {
                int i = roltable.getSelectedRow();
                int idvalue = (int) roltable.getModel().getValueAt(i, 0);
                crud.deletestatement(rolname, rolid, idvalue);
                setTableSets();
                clearTxt();
                showdefaultbtnvalues(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea eliminar");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        clearTxt();
    }//GEN-LAST:event_formWindowClosed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        clearSelection();
        showdefaultbtnvalues(false);
        clearTxt();
        setTableSets();
    }//GEN-LAST:event_formMouseClicked

     public void setTableSets() {

        try {
            model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Nombre");
            model.addColumn("Estado");
            model.addColumn("FechaDeCreacion");
            crud.readstatement(rolname);
            while (crud.getresultset().next()) {
                Object[] row = new Object[4];
                for (int i = 0; i < row.length; i++) {
                    row[i] = crud.getresultset().getObject(i + 1);
                }
                model.addRow(row);
            }
            this.roltable.setModel(model);
            this.roltable.removeColumn(this.roltable.getColumnModel().getColumn(0));
        } catch (SQLException ex) {

        }
    }

    private void clearTxt(){
        txtname.setText("");
        txtstate.setText("");
        txtsearch.setText("");
    }
    
    public void clearSelection() {
        roltable.clearSelection();
        roltable.getSelectionModel().clearSelection();
    }

    
    private void searchrow(){
        try{
            String thisidvalue=txtsearch.getText();
            int integeridvalue=Integer.parseInt(thisidvalue);
                model = new DefaultTableModel();
                model.addColumn("ID");
                model.addColumn("Nombre");
                model.addColumn("Estado");
                model.addColumn("FechaDeCreacion");
                crud.searchStatement(rolname,rolid,integeridvalue );
                while (crud.getresultset().next()) {
                    Object[] row = new Object[4];
                    for (int i = 0; i < row.length; i++) {
                        row[i] = crud.getresultset().getObject(i + 1);
                    }
                    model.addRow(row);
                }
                this.roltable.setModel(model);
                this.roltable.removeColumn(this.roltable.getColumnModel().getColumn(0));
                clearTxt();
            } catch (SQLException ex) {

            }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JToggleButton btnRead;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roltable;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtstate;
    // End of variables declaration//GEN-END:variables
}
