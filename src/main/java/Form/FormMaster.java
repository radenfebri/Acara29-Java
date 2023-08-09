/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

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
        DataMember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("APLIKASI PENJUALAN SEDERHANA");

        DataBarang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataBarang.setText("Data Barang");
        DataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataBarangActionPerformed(evt);
            }
        });

        DataPenjualan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataPenjualan.setText("Data Penjualan");
        DataPenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPenjualanActionPerformed(evt);
            }
        });

        DataSupplier.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataSupplier.setText("Data Supplier");
        DataSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataSupplierActionPerformed(evt);
            }
        });

        DataPembelian.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataPembelian.setText("Data Pembelian");
        DataPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPembelianActionPerformed(evt);
            }
        });

        DataMember.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DataMember.setText("Data Member");
        DataMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(DataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DataSupplier)
                .addGap(18, 18, 18)
                .addComponent(DataMember)
                .addGap(18, 18, 18)
                .addComponent(DataPembelian)
                .addGap(18, 18, 18)
                .addComponent(DataPenjualan)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataMember, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataBarangActionPerformed

    private void DataPenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPenjualanActionPerformed
        // TODO add your handling code here:
        new FormPenjualan().setVisible(true);
    }//GEN-LAST:event_DataPenjualanActionPerformed

    private void DataSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataSupplierActionPerformed

    private void DataPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPembelianActionPerformed
        // TODO add your handling code here:
        new Pembelian().setVisible(true);
    }//GEN-LAST:event_DataPembelianActionPerformed

    private void DataMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataMemberActionPerformed

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
    private javax.swing.JButton DataMember;
    private javax.swing.JButton DataPembelian;
    private javax.swing.JButton DataPenjualan;
    private javax.swing.JButton DataSupplier;
    private org.gjt.mm.mysql.Driver driver1;
    private org.gjt.mm.mysql.Driver driver2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
