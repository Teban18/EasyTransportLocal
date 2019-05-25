/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.Crud;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deiber
 */
public class ShipmentView extends javax.swing.JFrame {

    private DefaultTableModel model;
    private ArrayList<String> columns = new ArrayList<String>();
    private ArrayList<String> values;
    private Crud crud;
    private String shname = "shipment";
    private String shid = "shipment_id";

    public ShipmentView() {
        initComponents();
        columns.add("shipment_price");
        columns.add("origin_city");
        columns.add("destiny_city");
        columns.add("remitter");
        columns.add("addressee");
        columns.add("state");
        columns.add("delivered_by");
        columns.add("delivered_shipment_date");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setCrud(Crud crud) {
        this.crud = crud;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        txtaddressee = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtdelivereddate = new javax.swing.JTextField();
        txtdestiny = new javax.swing.JTextField();
        txtsearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdeliveredby = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        shtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtstate = new javax.swing.JTextField();
        btninsert = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        txtorigin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        txtremitter = new javax.swing.JTextField();
        btnread = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Destino");

        jLabel1.setText("Envío");

        jLabel8.setText("Estado");

        shtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        shtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(shtable);

        jLabel2.setText("Busqueda por ID");

        jLabel3.setText("Precio");

        btninsert.setText("Agregar");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        jLabel9.setText("Entregado por");

        btnupdate.setText("Editar");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel4.setText("Origen");

        jLabel6.setText("Remitente");

        jLabel10.setText("Fecha Entrega");

        btndelete.setText("Eliminar");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnread.setText("Buscar");
        btnread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreadActionPerformed(evt);
            }
        });

        jLabel7.setText("Destinatario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtremitter, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtaddressee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtorigin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(txtdestiny, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(29, 29, 29)
                                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(txtdeliveredby, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(txtdelivereddate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel6)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel7)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btninsert, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btnread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(461, 461, 461)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel4)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnread)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtorigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdestiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btninsert)
                            .addComponent(txtaddressee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtremitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdelivereddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(btnupdate)
                        .addGap(28, 28, 28)
                        .addComponent(btndelete))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtdeliveredby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        try {
            values = new ArrayList<String>();
            values.add(txtprice.getText());
            values.add(txtorigin.getText());
            values.add(txtdestiny.getText());
            values.add(txtremitter.getText());
            values.add(txtaddressee.getText());
            values.add(txtstate.getText());
            values.add(txtdeliveredby.getText());
            values.add(txtdelivereddate.getText());
            crud.createstatement(shname, columns, values);
            setTableSets();
            cleartxt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        try {
            if (shtable.getSelectedRow() != -1) {
                int i = shtable.getSelectedRow();
                int idvalue = (int) shtable.getValueAt(i, 0);
                ArrayList<String> thisvalues = new ArrayList<String>();
                thisvalues.add(txtprice.getText());
                thisvalues.add(txtorigin.getText());
                thisvalues.add(txtdestiny.getText());
                thisvalues.add(txtremitter.getText());
                thisvalues.add(txtaddressee.getText());
                thisvalues.add(txtstate.getText());
                thisvalues.add(txtdeliveredby.getText());
                thisvalues.add(txtdelivereddate.getText());
                crud.updatestatement(shname, columns, thisvalues, shid, idvalue);
                setTableSets();
                cleartxt();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try {
            if (shtable.getSelectedRow() != -1) {
                int i = shtable.getSelectedRow();
                int idvalue = (int) shtable.getValueAt(i, 0);
                crud.deletestatement(shname, shid, idvalue);
                setTableSets();
                cleartxt();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione el registro que desea eliminar");
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreadActionPerformed
        try {
            String thisidvalue = txtsearch.getText();
            int integeridvalue = Integer.parseInt(thisidvalue);
            try {
                model = new DefaultTableModel();
                model.addColumn("ID");
                model.addColumn("Precio");
                model.addColumn("Origen");
                model.addColumn("Destino");
                model.addColumn("Remitente");
                model.addColumn("Destinatario");
                model.addColumn("Estado");
                model.addColumn("EntregadoPor");
                model.addColumn("FechaCreacion");
                model.addColumn("FechaEntrega");
                crud.searchStatement(shname, shid, integeridvalue);
                while (crud.getresultset().next()) {
                    Object[] row = new Object[10];
                    for (int i = 0; i < row.length; i++) {
                        row[i] = crud.getresultset().getObject(i + 1);
                    }
                    model.addRow(row);
                }
                this.shtable.setModel(model);
                cleartxt();
            } catch (SQLException ex) {

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe un registro con ese ID");
        }
    }//GEN-LAST:event_btnreadActionPerformed

    private void shtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shtableMouseClicked
        int i = shtable.getSelectedRow();
        txtprice.setText((String) shtable.getValueAt(i, 1));
        txtorigin.setText((String) shtable.getValueAt(i, 2));
        txtdestiny.setText((String) shtable.getValueAt(i, 3));
        txtremitter.setText((String) shtable.getValueAt(i, 4));
        txtaddressee.setText((String) shtable.getValueAt(i, 5));
        txtstate.setText((String) shtable.getValueAt(i, 6));
        txtdeliveredby.setText((String) shtable.getValueAt(i, 7));
        txtdelivereddate.setText((String) shtable.getValueAt(i, 9));

    }//GEN-LAST:event_shtableMouseClicked

    private void cleartxt() {
        txtprice.setText("");
        txtorigin.setText("");
        txtdestiny.setText("");
        txtremitter.setText("");
        txtaddressee.setText("");
        txtstate.setText("");
        txtdeliveredby.setText("");
        txtdelivereddate.setText("");
        txtsearch.setText("");
    }

    public void setTableSets() {

        try {
            model = new DefaultTableModel();
            model.addColumn("ID");
            model.addColumn("Precio");
            model.addColumn("Origen");
            model.addColumn("Destino");
            model.addColumn("Remitente");
            model.addColumn("Destinatario");
            model.addColumn("Estado");
            model.addColumn("EntregadoPor");
            model.addColumn("FechaCreacion");
            model.addColumn("FechaEntrega");
            crud.readstatement(shname);
            while (crud.getresultset().next()) {
                Object[] row = new Object[10];
                for (int i = 0; i < row.length; i++) {
                    row[i] = crud.getresultset().getObject(i + 1);
                }
                model.addRow(row);
            }
            this.shtable.setModel(model);
        } catch (SQLException ex) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JToggleButton btnread;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable shtable;
    private javax.swing.JTextField txtaddressee;
    private javax.swing.JTextField txtdeliveredby;
    private javax.swing.JTextField txtdelivereddate;
    private javax.swing.JTextField txtdestiny;
    private javax.swing.JTextField txtorigin;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtremitter;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtstate;
    // End of variables declaration//GEN-END:variables
}
