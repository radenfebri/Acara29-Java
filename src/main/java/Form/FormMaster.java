/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import javax.swing.JOptionPane;

/**
 *
 * @author febri
 */
public class FormMaster extends javax.swing.JFrame {

    /**
     * Creates new form FormMaster
     */
    public FormMaster() {
        initComponents();
    }
    
    public void logout() {
    // Hapus informasi sesi pengguna
    UserSession.clearSession();

    // Tampilkan pesan atau lakukan tindakan lain
    JOptionPane.showMessageDialog(null, "Berhasil Logout");

    // Buka kembali halaman login atau form login
    new FormLoginPenjual().setVisible(true);
    this.dispose();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        try {
            driver1 = new org.gjt.mm.mysql.Driver();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        try {
            driver2 = new org.gjt.mm.mysql.Driver();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
        jLabel1 = new javax.swing.JLabel();
        DataBarang = new javax.swing.JButton();
        DataPenjualan = new javax.swing.JButton();
        DataSupplier = new javax.swing.JButton();
        DataPembelian = new javax.swing.JButton();
        DataPembeli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(76, 209, 55));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("APLIKASI PENJUALAN SEDERHANA");

        DataBarang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataBarang.setText("Barang");
        DataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBarangActionPerformed(evt);
            }
        });

        DataPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataPenjualan.setText("Penjual");
        DataPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPenjualanActionPerformed(evt);
            }
        });

        DataSupplier.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataSupplier.setText("Supplier");
        DataSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataSupplierActionPerformed(evt);
            }
        });

        DataPembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataPembelian.setText("Transaksi");
        DataPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPembelianActionPerformed(evt);
            }
        });

        DataPembeli.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataPembeli.setText("Pembeli");
        DataPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPembeliActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/store.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Logout.setText("Keluar");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DataPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBarangActionPerformed
        // TODO add your handling code here:
        FormBarang fmbarang = new FormBarang();
        fmbarang.show();
        
        dispose();
    }//GEN-LAST:event_DataBarangActionPerformed

    private void DataPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPenjualanActionPerformed
        // TODO add your handling code here:
        FormPenjual fmpenjualan = new FormPenjual();
        fmpenjualan.show();
        
        dispose();
    }//GEN-LAST:event_DataPenjualanActionPerformed

    private void DataSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataSupplierActionPerformed
        // TODO add your handling code here:
        FormSupplier fmsupplier = new FormSupplier();
        fmsupplier.show();
        
        dispose();
    }//GEN-LAST:event_DataSupplierActionPerformed

    private void DataPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPembelianActionPerformed
        // TODO add your handling code here:
        FormPesananMasuk fmpesanan = new FormPesananMasuk();
        fmpesanan.show();
        
        dispose();
    }//GEN-LAST:event_DataPembelianActionPerformed

    private void DataPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPembeliActionPerformed
        // TODO add your handling code here:
        FormPembeli fmpembeli = new FormPembeli();
        fmpembeli.show();
        
        dispose();
    }//GEN-LAST:event_DataPembeliActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        logout();
    }//GEN-LAST:event_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(FormMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DataBarang;
    private javax.swing.JButton DataPembeli;
    private javax.swing.JButton DataPembelian;
    private javax.swing.JButton DataPenjualan;
    private javax.swing.JButton DataSupplier;
    private javax.swing.JButton Logout;
    private org.gjt.mm.mysql.Driver driver1;
    private org.gjt.mm.mysql.Driver driver2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
