/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Model.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author febri
 */
public class FormTransaksi extends javax.swing.JFrame {
    
    private String id_barang;

    /**
     * Creates new form FormPenjualan
     */
    String nama = UserSession.getNama();
    String alamat = UserSession.getAlamat();
    int id = UserSession.getID();
    
    public FormTransaksi() {
        initComponents();
        load_table();
        transaction_table();
        TxtNama.setText(nama);
        TxtAlamat.setText(alamat);
        
        try {
            String sql = "SELECT * from tb_barang";
            java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                ComboBarang.addItem(res.getString("nama_barang"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    private void load_table() {
        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("No. Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Merk Barang");
        model.addColumn("Harga");
        model.addColumn("Stok");

        try {
            String sql = "SELECT * from tb_barang";
            java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
//                    res.getInt(1), 
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
    
    private void transaction_table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. Invoice");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Barang");
        model.addColumn("Qty");
        model.addColumn("Grand Total");
        model.addColumn("Status");

        try {
            String sql = "SELECT CONCAT('INV/', no_invoice, '/', YEAR(CURDATE())), nama_pembeli, alamat, tb_barang.nama_barang, qty, grand_total, IF(is_confirm=1, 'Diterima', 'On Progress')  "
                    + "from tb_transaksi "
                    + "left Join tb_barang on tb_barang.id_barang = tb_transaksi.id_barang "
                    + "where id_pembeli = " + id;
            java.sql.Connection conn = (Connection) Koneksi.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getString(1), 
                    res.getString(2), 
                    res.getString(3),
                    res.getString(4),
                    res.getInt(5),
                    res.getInt(6),
                    res.getString(7),
                });
            }
            System.out.println("Data: " + res);
            TBTransaksi.setModel(model);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtQty = new javax.swing.JTextField();
        Delete = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TBTransaksi = new javax.swing.JTable();
        TxtNama = new javax.swing.JTextField();
        ComboBarang = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        TxtAlamat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TbBarang = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Logout = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("TRANSAKSI");

        jLabel4.setText("Nama Pembeli");

        jLabel5.setText("Nama Barang");

        jLabel6.setText("Qty");

        TxtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQtyActionPerformed(evt);
            }
        });

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Save.setText("SAVE");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        TBTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TBTransaksi);

        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });

        jLabel7.setText("Alamat");

        TxtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAlamatActionPerformed(evt);
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
        jScrollPane2.setViewportView(TbBarang);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("HARGA BARANG");

        Logout.setText("Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Save)
                                        .addGap(18, 18, 18)
                                        .addComponent(Clear)
                                        .addGap(18, 18, 18)
                                        .addComponent(Delete)
                                        .addGap(527, 527, 527))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ComboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(40, 40, 40))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(315, 315, 315))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(TxtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Clear)
                    .addComponent(Delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KodeSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KodeSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KodeSupplierActionPerformed

    private void NamaPerusahaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaPerusahaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaPerusahaanActionPerformed

    private void TxtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQtyActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try {
            // membuat koneksi baru
            Koneksi ObjKoneksi = new Koneksi();
            Connection con = ObjKoneksi.koneksiDB();
            Statement st = con.createStatement();
            // Membuat query dan langsung mengisinya saat dipanggil
            String sql = "delete from tb_transaksi where id_barang = " + id_barang;
            int row = st.executeUpdate(sql);//eksekusi query sql
            if (row == 1) {
                // menampilkan UI pop up berhasil
                JOptionPane.showMessageDialog(null, "Data sukses dihapus", "Data Transaksi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            // menampilkan UI pop up gagal
            JOptionPane.showMessageDialog(null, "Data gagal dihapus", "Data Transaksi", JOptionPane.ERROR_MESSAGE);
        }
        transaction_table();
    }//GEN-LAST:event_DeleteActionPerformed

    private void TxtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtAlamatActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        try {
            
            Koneksi ObjKoneksi = new Koneksi();
            Connection con = ObjKoneksi.koneksiDB();
            Statement st = con.createStatement();
            
            String sql_barang = "SELECT * from tb_barang where nama_barang = '" + ComboBarang.getSelectedItem() + "' ORDER BY id_barang DESC LIMIT 1";
            java.sql.ResultSet res = st.executeQuery(sql_barang);
            
            String harga = "";
            String stok = "";
            if (res.next()) {
                id_barang = res.getString("id_barang");
                harga = res.getString("harga_barang");
                stok = res.getString("stok_barang");
            }
            
            String sql = "insert into tb_transaksi(id_pembeli,nama_pembeli,alamat,id_barang, qty, grand_total) "
                    + "values ('" + id + "', '" + TxtNama.getText() + "', '" + TxtAlamat.getText()+ "', " + id_barang + ", " + TxtQty.getText() + ", " + Integer.parseInt(TxtQty.getText()) * Integer.parseInt(harga) + ")";
            int row = st.executeUpdate(sql);

            if (row == 1) {
                String sql_update_barang = "update tb_barang set stok_barang= " + (Integer.parseInt(stok) - Integer.parseInt(TxtQty.getText())) + " where id_barang = " + id_barang;
                st.executeUpdate(sql_update_barang);
                
                JOptionPane.showMessageDialog(null, "Sukses menambahkan transaksi", "Data Barang", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Data Transaksi", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("gagal menambah kedalam database \n" + e);
        }
        load_table();
        transaction_table();
    }//GEN-LAST:event_SaveActionPerformed

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaActionPerformed

    private void TbBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbBarangMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TbBarangMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        TxtNama.setText("");
        TxtAlamat.setText("");
        TxtQty.setText("");
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JComboBox ComboBarang;
    private javax.swing.JButton Delete;
    private javax.swing.JToggleButton Logout;
    private javax.swing.JButton Save;
    private javax.swing.JTable TBTransaksi;
    private javax.swing.JTable TbBarang;
    private javax.swing.JTextField TxtAlamat;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtQty;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
