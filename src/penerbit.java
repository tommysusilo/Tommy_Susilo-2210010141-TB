
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win 10
 */
public class penerbit extends javax.swing.JFrame {

    /**
     * Creates new form penerbit
     */
    public penerbit() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        no_penerbit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        no_transaksi1 = new javax.swing.JTextField();
        nama_penerbit = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NAMA PENERBIT");

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblTransaksi);

        btn_tambah.setBackground(new java.awt.Color(51, 128, 255));
        btn_tambah.setText("TAMBAH");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(0, 198, 56));
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(217, 0, 105));
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("NO. PENERBIT");

        no_penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_penerbitActionPerformed(evt);
            }
        });
        no_penerbit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_penerbitKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DATA PENERBIT");

        no_transaksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_transaksi1ActionPerformed(evt);
            }
        });
        no_transaksi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_transaksi1KeyTyped(evt);
            }
        });

        nama_penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_penerbitActionPerformed(evt);
            }
        });
        nama_penerbit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nama_penerbitKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(no_penerbit)
                            .addComponent(no_transaksi1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_transaksi1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nama_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(207, 35));

        jMenu1.setText("TRANSKASI");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("DATA BUKU");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("DATA PENERBIT");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        home ad = new home ();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        buku ad = new buku ();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        // TODO add your handling code here:
        //        int row = tblTransaksi.getSelectedRow();
        //        no_transaksi.setText(tblTransaksi.getValueAt(row, 0).toString());
        //        nama_agenda.setText(tblTransaksi.getValueAt(row, 1).toString());
        //        String tanggalStr = tblTransaksi.getValueAt(row, 2).toString();
        //
        //        // Mengonversi String tanggal ke Date
        //        try {
            //            // Menggunakan format yang sesuai dengan format tanggal di database (misalnya yyyy-MM-dd)
            //            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            //            Date tanggal = sdf.parse(tanggalStr);
            //
            //            // Menetapkan tanggal ke JDateChooser
            //            tgl_transaksi.setDate(tanggal); // Menggunakan metode setDate() untuk menetapkan nilai tanggal
            //        } catch (ParseException e) {
            //            // Jika parsing gagal, tampilkan error
            //
            //        }
        //        tempat_agenda.setText(tblTransaksi.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        //        // TODO add your handling code here:
        //        String id_agenda,agenda,tempat;
        //        java.util.Date tanggal;
        //
        //        id_agenda = no_transaksi.getText();
        //        agenda = nama_agenda.getText();
        //        tanggal = tgl_transaksi.getDate();
        //        tempat = tempat_agenda.getText();
        //
        //        try {
            //            db.tambah(id_agenda,agenda,tanggal,tempat);
            //        } catch (SQLException ex) {
            //            Logger.getLogger(AplikasiAgendaPribadi.class.getName()).log(Level.SEVERE, null, ex);
            //        }
        //        try {
            //            showTable();
            //        } catch (SQLException ex) {
            //            Logger.getLogger(AplikasiAgendaPribadi.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        //        String id_agenda,agenda,tempat;
        //        java.util.Date tanggal;
        //        id_agenda = no_transaksi.getText();
        //        agenda = nama_agenda.getText();
        //        tanggal = tgl_transaksi.getDate();
        //        tempat = tempat_agenda.getText();
        //        try {
            //            db.edit(id_agenda, agenda, tanggal, tempat);
            //        } catch (SQLException ex) {
            //            Logger.getLogger(AplikasiAgendaPribadi.class.getName()).log(Level.SEVERE, null, ex);
            //        }
        //        try {
            //            showTable();
            //        } catch (SQLException ex) {
            //            Logger.getLogger(AplikasiAgendaPribadi.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        //        String id;
        //        id= no_transaksi.getText();
        //        db.hapus(id);
        //        try {
            //            showTable();
            //        } catch (SQLException ex) {
            //            Logger.getLogger(AplikasiAgendaPribadi.class.getName()).log(Level.SEVERE, null, ex);
            //        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void no_penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_penerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_penerbitActionPerformed

    private void no_penerbitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_penerbitKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // Mencegah karakter yang bukan angka
            JOptionPane.showMessageDialog(null,
                "Masukkan angka yang valid!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_no_penerbitKeyTyped

    private void no_transaksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_transaksi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_transaksi1ActionPerformed

    private void no_transaksi1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_transaksi1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_no_transaksi1KeyTyped

    private void nama_penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_penerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_penerbitActionPerformed

    private void nama_penerbitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama_penerbitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_penerbitKeyTyped

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
            home ad = new home ();
            ad.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penerbit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penerbit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nama_penerbit;
    private javax.swing.JTextField no_penerbit;
    private javax.swing.JTextField no_transaksi1;
    private javax.swing.JTable tblTransaksi;
    // End of variables declaration//GEN-END:variables
}