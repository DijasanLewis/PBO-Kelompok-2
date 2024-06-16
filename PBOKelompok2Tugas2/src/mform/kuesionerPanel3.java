/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mform;

import mform.entity.DataPerkebunan;

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class kuesionerPanel3 extends javax.swing.JFrame {
    private String namaPetugas;
    private boolean kenaValidasi;
    private int jumlah_kebun;
    private int nomorKebun = 1;
    private DataPerkebunan dataPerkebunan;
    /**
     * Creates new form MF_Blok2
     */
    public kuesionerPanel3(String namaPetugas, boolean kenaValidasi, int jumlah_kebun, int nomorKebun, DataPerkebunan dataPerkebunan) {
        initComponents();
        this.namaPetugas = namaPetugas;
        this.kenaValidasi = kenaValidasi;
        this.jumlah_kebun = jumlah_kebun;
        this.nomorKebun = nomorKebun;
        this.dataPerkebunan = dataPerkebunan;
        if (kenaValidasi && (nomorKebun <= dataPerkebunan.getJumlahKebun()) && (nomorKebun <= jumlah_kebun)) {
            setField();
        } else {
            dataPerkebunan.setKebun();
        }
        judulLabel.setText("LUAS TANAMAN DAN PRODUKSI KEBUN KE-" + nomorKebun);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextToggleButton = new javax.swing.JToggleButton();
        judulLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jenis_kebunComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kab_kota_kode_kebunTextField = new javax.swing.JTextField();
        provinsi_kode_kebunTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        luas_areal_tanam_kebunTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        luas_areal_tebang_kebunTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        produksi_tebu_kebunTextField = new javax.swing.JTextField();
        produksi_gkp_kebunTextField = new javax.swing.JTextField();
        produksi_tetes_kebunTextField = new javax.swing.JTextField();
        produksi_hablur_kebunTextField = new javax.swing.JTextField();
        rendemen_hablur_kebunTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nextToggleButton.setText("NEXT");
        nextToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextToggleButtonActionPerformed(evt);
            }
        });

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        judulLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulLabel.setText("LUAS TANAMAN DAN PRODUKSI KEBUN KE-1");

        jLabel1.setText("Jenis Kebun:");

        jenis_kebunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tebu Sendiri", "Tebu Rakyat", "Pembelian dari Pihak Ketiga" }));

        jLabel9.setText("Provinsi:");

        jLabel10.setText("Kabupaten/Kota:");

        kab_kota_kode_kebunTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kab_kota_kode_kebunTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Luas Areal Tanam (Ha): ");

        jLabel4.setText("Luas Areal Tebang (Ha): ");

        jLabel5.setText("Produksi (Ton):");

        jLabel6.setText("Tebu:");

        jLabel7.setText("GKP:");

        jLabel8.setText("Tetes: ");

        jLabel11.setText("Hablur: ");

        jLabel12.setText("Rendemen Hablur (%): ");

        produksi_tebu_kebunTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produksi_tebu_kebunTextFieldActionPerformed(evt);
            }
        });

        produksi_gkp_kebunTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produksi_gkp_kebunTextFieldActionPerformed(evt);
            }
        });

        produksi_tetes_kebunTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produksi_tetes_kebunTextFieldActionPerformed(evt);
            }
        });

        produksi_hablur_kebunTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produksi_hablur_kebunTextFieldActionPerformed(evt);
            }
        });

        rendemen_hablur_kebunTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendemen_hablur_kebunTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luas_areal_tanam_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(luas_areal_tebang_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produksi_tebu_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produksi_gkp_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produksi_tetes_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produksi_hablur_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rendemen_hablur_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nextToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jenis_kebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(provinsi_kode_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kab_kota_kode_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(judulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judulLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenis_kebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provinsi_kode_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_kota_kode_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(luas_areal_tanam_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(luas_areal_tebang_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(produksi_tebu_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(produksi_gkp_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(produksi_tetes_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(produksi_hablur_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rendemen_hablur_kebunTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextToggleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kab_kota_kode_kebunTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kab_kota_kode_kebunTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kab_kota_kode_kebunTextFieldActionPerformed

    private void produksi_tebu_kebunTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produksi_tebu_kebunTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produksi_tebu_kebunTextFieldActionPerformed

    private void produksi_gkp_kebunTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produksi_gkp_kebunTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produksi_gkp_kebunTextFieldActionPerformed

    private void produksi_tetes_kebunTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produksi_tetes_kebunTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produksi_tetes_kebunTextFieldActionPerformed

    private void produksi_hablur_kebunTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produksi_hablur_kebunTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produksi_hablur_kebunTextFieldActionPerformed

    private void rendemen_hablur_kebunTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendemen_hablur_kebunTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rendemen_hablur_kebunTextFieldActionPerformed

    private void nextToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextToggleButtonActionPerformed
        // TODO add your handling code here:
        dataPerkebunan.getKebun(nomorKebun - 1).setJenisKebun(jenis_kebunComboBox.getSelectedItem().toString());
        dataPerkebunan.getKebun(nomorKebun - 1).getLetak().setProv(provinsi_kode_kebunTextField.getText());
        dataPerkebunan.getKebun(nomorKebun - 1).getLetak().setKabKota(kab_kota_kode_kebunTextField.getText());
        dataPerkebunan.getKebun(nomorKebun - 1).setLuasArealTanam(Double.parseDouble(luas_areal_tanam_kebunTextField.getText()));
        dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().setLuasArealTebang(Double.parseDouble(luas_areal_tebang_kebunTextField.getText()));
        dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().setProduksiTebu(Double.parseDouble(produksi_tebu_kebunTextField.getText()));
        dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().setProduksiGKP(Double.parseDouble(produksi_gkp_kebunTextField.getText()));
        dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().setProduksiTetes(Double.parseDouble(produksi_tetes_kebunTextField.getText()));
        dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().setProduksiHablur(Double.parseDouble(produksi_hablur_kebunTextField.getText()));
        dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().setRendemenHablur(Double.parseDouble(rendemen_hablur_kebunTextField.getText()));
        
        if (nomorKebun == jumlah_kebun){
            if (kenaValidasi) {
                dataPerkebunan.setJumlahKebun(jumlah_kebun);
                for (int i = nomorKebun + 1; i <= 10; i++) {
                    if (dataPerkebunan.getKebun(i - 1) != null) {
                        dataPerkebunan.deleteKebun(i - 1);
                    }
                }
            }
            kuesionerPanel4 panel4 = new kuesionerPanel4(namaPetugas, kenaValidasi, dataPerkebunan);
            panel4.setVisible(true);
            this.setVisible(false);
        }
        else {
            kuesionerPanel3 panel3 = new kuesionerPanel3(namaPetugas, kenaValidasi, jumlah_kebun, nomorKebun + 1, dataPerkebunan);
            panel3.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_nextToggleButtonActionPerformed

    private void setField(){
        //Jenis kebun
        switch (dataPerkebunan.getKebun(nomorKebun - 1).getJenisKebun().toLowerCase()) {
            case "tebu sendiri" -> jenis_kebunComboBox.setSelectedIndex(0);
            case "tebu rakyat" -> jenis_kebunComboBox.setSelectedIndex(1);
            case "pembelian dari pihak ketiga" -> jenis_kebunComboBox.setSelectedIndex(2);
            default -> jenis_kebunComboBox.setSelectedIndex(0);
        }
        provinsi_kode_kebunTextField.setText(dataPerkebunan.getKebun(nomorKebun - 1).getLetak().getProv());
        kab_kota_kode_kebunTextField.setText(dataPerkebunan.getKebun(nomorKebun - 1).getLetak().getKabKota());
        luas_areal_tanam_kebunTextField.setText(Double.toString(dataPerkebunan.getKebun(nomorKebun - 1).getLuasArealTanam()));
        luas_areal_tebang_kebunTextField.setText(Double.toString(dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().getLuasArealTebang()));
        produksi_tebu_kebunTextField.setText(Double.toString(dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().getProduksiTebu()));
        produksi_gkp_kebunTextField.setText(Double.toString(dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().getProduksiGKP()));
        produksi_tetes_kebunTextField.setText(Double.toString(dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().getProduksiTetes()));
        produksi_hablur_kebunTextField.setText(Double.toString(dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().getProduksiHablur()));
        rendemen_hablur_kebunTextField.setText(Double.toString(dataPerkebunan.getKebun(nomorKebun - 1).getProduksi().getRendemenHablur()));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String namaPetugas = null;
        boolean kenaValidasi = false;
        int jumlah_kebun = 1;
        int nomorKebun = 1;
        DataPerkebunan dataPerkebunan = null;
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
            java.util.logging.Logger.getLogger(kuesionerPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kuesionerPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kuesionerPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kuesionerPanel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new kuesionerPanel3(namaPetugas, kenaValidasi, jumlah_kebun, nomorKebun, dataPerkebunan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jenis_kebunComboBox;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField kab_kota_kode_kebunTextField;
    private javax.swing.JTextField luas_areal_tanam_kebunTextField;
    private javax.swing.JTextField luas_areal_tebang_kebunTextField;
    private javax.swing.JToggleButton nextToggleButton;
    private javax.swing.JTextField produksi_gkp_kebunTextField;
    private javax.swing.JTextField produksi_hablur_kebunTextField;
    private javax.swing.JTextField produksi_tebu_kebunTextField;
    private javax.swing.JTextField produksi_tetes_kebunTextField;
    private javax.swing.JTextField provinsi_kode_kebunTextField;
    private javax.swing.JTextField rendemen_hablur_kebunTextField;
    // End of variables declaration//GEN-END:variables
}
