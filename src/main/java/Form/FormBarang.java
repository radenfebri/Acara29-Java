/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Model.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author febri
 */
public class FormBarang extends javax.swing.JFrame {

    /**
     * Creates new form FormBarang
     */
    private String id_barang;
    
    public FormBarang() {
        initComponents();
        load_table();
    }

    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Merk Barang");
        model.addColumn("Stok");
        model.addColumn("Harga");

        try {
            String sql = "SELECT * from tb_barang";
            java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getInt(1), 
                    res.getString(2), 
                    res.getString(3),
                    res.getString(4),
                    res.getInt(5),
                });
            }
            System.out.println("Data: " + res);
            TbBarang.setModel(model);
        } catch (Exception e) {
            System.out.println("Error Found: " + e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NamaBarang = new javax.swing.JTextField();
        MerkBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HargaBarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        StokBarang = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbBarang = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("BARANG");

        jLabel1.setText("Nama Barang");

        NamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaBarangActionPerformed(evt);
            }
        });

        MerkBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerkBarangActionPerformed(evt);
            }
        });

        jLabel2.setText("Merk Barang");

        HargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaBarangActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga Barang");

        jLabel5.setText("Stok Barang");

        StokBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StokBarangActionPerformed(evt);
            }
        });

        TbBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TbBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbBarang);

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setText("EDIT");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Add)
                                .addGap(18, 18, 18)
                                .addComponent(Edit)
                                .addGap(18, 18, 18)
                                .addComponent(Clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Delete)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(MerkBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(HargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(StokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(277, 277, 277)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(jButton1))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(MerkBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(HargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(StokBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Delete)
                    .addComponent(Edit)
                    .addComponent(Clear))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaBarangActionPerformed

    private void MerkBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerkBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MerkBarangActionPerformed

    private void HargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaBarangActionPerformed

    private void StokBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StokBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StokBarangActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        try {
            Koneksi ObjKoneksi = new Koneksi();
            Connection con = ObjKoneksi.koneksiDB();
            Statement st = con.createStatement();
            String sql = "insert into tb_barang(nama_barang,merk_barang,harga_barang) "
                    + "values ('" + NamaBarang.getText() + "', '" + MerkBarang.getText() + "', '" + HargaBarang.getText()+ "', '" + HargaBarang.getText() + "')";
            int row = st.executeUpdate(sql);

            if (row == 1) {
                JOptionPane.showMessageDialog(null, "Sukses menambahkan barang", "Data Barang", JOptionPane.INFORMATION_MESSAGE);
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan barang", "Data Barang", JOptionPane.INFORMATION_MESSAGE);
        }
        load_table();
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try {
            Koneksi ObjKoneksi = new Koneksi();
            Connection con = ObjKoneksi.koneksiDB();
            Statement st = con.createStatement();
            String sql = "delete from tb_barang where id_barang = " + id_barang;
            int row = st.executeUpdate(sql);
            if (row == 1) {
                JOptionPane.showMessageDialog(null, "Data sukses dihapus", "Data Sepatu", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Data Sepatu", JOptionPane.ERROR_MESSAGE);
        }
        load_table();
    }//GEN-LAST:event_DeleteActionPerformed

    private void TbBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBarangMouseClicked
        // TODO add your handling code here:
        id_barang = TbBarang.getValueAt(TbBarang.getSelectedRow(), 0).toString();
        NamaBarang.setText(TbBarang.getValueAt(TbBarang.getSelectedRow(), 1).toString());
        MerkBarang.setText(TbBarang.getValueAt(TbBarang.getSelectedRow(), 2).toString());
        StokBarang.setText(TbBarang.getValueAt(TbBarang.getSelectedRow(), 3).toString());
        HargaBarang.setText(TbBarang.getValueAt(TbBarang.getSelectedRow(), 4).toString());
        
        boolean editTbl = TbBarang.isEditing();
        if (editTbl == false) {
            JOptionPane.showMessageDialog(null, "Sukses memilih Data Sepatu", "Data Sepatu", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_TbBarangMouseClicked

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        try {
            Koneksi ObjKoneksi = new Koneksi();
            Connection con = ObjKoneksi.koneksiDB();
            Statement st = con.createStatement();

            String sql = "update tb_barang set nama_barang ='" + NamaBarang.getText() + "',"
                    + "merk_barang ='" + MerkBarang.getText() + "',harga_barang = " + HargaBarang.getText()
                    + " where id_barang = " + id_barang;

            int row = st.executeUpdate(sql);
            if (row == 1) {
                JOptionPane.showMessageDialog(null, "Sukses merubah data", "Data Sepatu", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Data Sepatu", JOptionPane.ERROR_MESSAGE);
        }
        load_table();
    }//GEN-LAST:event_EditActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        NamaBarang.setText("");
        MerkBarang.setText("");
        HargaBarang.setText("");
        StokBarang.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FormMaster fmkembali = new FormMaster();
        fmkembali.show();
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField HargaBarang;
    private javax.swing.JTextField MerkBarang;
    private javax.swing.JTextField NamaBarang;
    private javax.swing.JTextField StokBarang;
    private javax.swing.JTable TbBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
