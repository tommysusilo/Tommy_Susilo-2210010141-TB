
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win 10
 */
public class buku extends javax.swing.JFrame {

    private final proses_db db;
    private DefaultTableModel tbl;
    private HashMap<String, String> penerbitMap = new HashMap<>();

    /**
     * Creates new form buku
     */
    public buku() {
        db = new proses_db();
        initComponents();
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(buku.class.getName()).log(Level.SEVERE, null, ex);
        }
         penerbitMap = new HashMap<>();
        loadComboBoxData(); 
        
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        harga_buku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nama_penerbit = new javax.swing.JComboBox<>();
        no_buku = new javax.swing.JTextField();
        nama_buku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NAMA BUKU");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NAMA PENERBIT");

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblBuku);

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
        jLabel5.setText("NO. BUKU");

        harga_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_bukuActionPerformed(evt);
            }
        });
        harga_buku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                harga_bukuKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DATA BUKU");

        nama_penerbit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nama_penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_penerbitActionPerformed(evt);
            }
        });

        no_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_bukuActionPerformed(evt);
            }
        });
        no_buku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_bukuKeyTyped(evt);
            }
        });

        nama_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_bukuActionPerformed(evt);
            }
        });
        nama_buku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nama_bukuKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("HARGA BUKU");

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
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama_penerbit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(no_buku, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(harga_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nama_penerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4))
                    .addComponent(harga_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(207, 35));

        jMenu1.setText("TRANSKASI");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("DATA BUKU");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("DATA PENERBIT");
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
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        buku ad = new buku ();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        // TODO add your handling code here:
                int row = tblBuku.getSelectedRow();
                no_buku.setText(tblBuku.getValueAt(row, 0).toString());
                nama_buku.setText(tblBuku.getValueAt(row, 1).toString());
                harga_buku.setText(tblBuku.getValueAt(row, 3).toString());
                String selectedPenerbit = tblBuku.getValueAt(row, 2).toString(); // Misalnya nama penerbit ada di kolom 2
    
    // Set nilai JComboBox sesuai nama penerbit
                nama_penerbit.setSelectedItem(selectedPenerbit);
//for (Map.Entry<String, String> entry : penerbitMap.entrySet()) {
//    if (entry.getValue().equals(idPenerbit)) {
//        nama_penerbit.setSelectedItem(entry.getKey()); // Set nama penerbit di JComboBox
//        break;
//    }
//}
//                // Mengonversi String tanggal ke Date
                
    }//GEN-LAST:event_tblBukuMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        //        // TODO add your handling code here:
                String id_buku,nama,harga;
                id_buku = no_buku.getText();
                nama = nama_buku.getText();
                harga = harga_buku.getText();
                String selectedNamaPenerbit = (String) nama_penerbit.getSelectedItem();
        String id_penerbit = penerbitMap.get(selectedNamaPenerbit);
        
        if (id_penerbit == null || id_penerbit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih penerbit terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        no_buku.setText("");
    nama_buku.setText("");
    harga_buku.setText("");
      nama_penerbit.setSelectedIndex(0);
           
         
        try {
            db.tambah_buku(id_buku,nama,harga,id_penerbit);
        } catch (SQLException ex) {
            Logger.getLogger(buku.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(buku.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
                String id_buku,nama,harga;
                id_buku = no_buku.getText();
                nama = nama_buku.getText();
                harga = harga_buku.getText();
                String selectedNamaPenerbit = (String) nama_penerbit.getSelectedItem();
                String id_penerbit = penerbitMap.get(selectedNamaPenerbit);
        
        if (id_penerbit == null || id_penerbit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pilih penerbit terlebih dahulu!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
             
        try {
            db.edit_buku(id_buku,nama,harga,id_penerbit);
        } catch (SQLException ex) {
            Logger.getLogger(buku.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(buku.class.getName()).log(Level.SEVERE, null, ex);
        }
         no_buku.setText("");
    nama_buku.setText("");
    harga_buku.setText("");
      nama_penerbit.setSelectedIndex(0);
                  
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
                String id;
                id= no_buku.getText();
                db.hapus_buku(id);
                 no_buku.setText("");
    nama_buku.setText("");
    harga_buku.setText("");
      nama_penerbit.setSelectedIndex(0);
 
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(buku.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void harga_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_bukuActionPerformed

    private void harga_bukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_harga_bukuKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume(); // Mencegah karakter yang bukan angka
            JOptionPane.showMessageDialog(null,
                "Masukkan angka yang valid!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_harga_bukuKeyTyped

    private void no_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_bukuActionPerformed

    private void no_bukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_bukuKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_no_bukuKeyTyped

    private void nama_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_bukuActionPerformed

    private void nama_bukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nama_bukuKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_bukuKeyTyped

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
            home ad = new home ();
            ad.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
         penerbit ad = new penerbit ();
            ad.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void nama_penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_penerbitActionPerformed
        // TODO add your handling code here:
//        try {
//        // Mendapatkan data dari database
//        ResultSet rs = db.lihat_penerbit(); // Asumsikan ini method untuk mengambil data dari database
//        
//        // Hapus semua item di JComboBox terlebih dahulu (opsional jika hanya menambahkan data baru)
//        nama_penerbit.removeAllItems();
//        
//        // Iterasi data ResultSet dan tambahkan ke JComboBox
//        while (rs.next()) {
//            String penerbit = rs.getString("nama_penerbit"); // Sesuaikan dengan nama kolom tabel
//            nama_penerbit.addItem(penerbit);
//        }
//        
//    } catch (SQLException ex) {
//            // Untuk debugging jika terjadi error
//            
//    }
    }//GEN-LAST:event_nama_penerbitActionPerformed

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
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JTextField harga_buku;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField nama_buku;
    private javax.swing.JComboBox<String> nama_penerbit;
    private javax.swing.JTextField no_buku;
    private javax.swing.JTable tblBuku;
    // End of variables declaration//GEN-END:variables

    private void showTable() throws SQLException {
        tbl = new DefaultTableModel(new String[]{"No. Buku","Nama Buku","Nama Penerbit","Harga"},0);
        ResultSet rs;
        rs = db.lihat_buku();
        while(rs.next()){
            tbl.addRow(new Object[]{
                rs.getString("id_buku"),
                rs.getString("nama_buku"),
                rs.getString("nama_penerbit"),
                 rs.getString("harga_buku")
            });
        }
        
        tblBuku.setModel(tbl);
    }

    private void loadComboBoxData() {
        try {
              ResultSet rs = db.lihat_penerbit(); // Ambil data dari database
        
        nama_penerbit.removeAllItems(); // Hapus item lama (jika ada)
        nama_penerbit.addItem("-- Pilih Penerbit --"); // Tambahkan placeholder
        penerbitMap.clear(); // Bersihkan HashMap untuk menghindari duplikasi

        while (rs.next()) {
            String id_penerbit = rs.getString("id_penerbit"); // Ambil id_penerbit
            String nama = rs.getString("nama_penerbit"); // Ambil nama_penerbit
            
            // Simpan ke HashMap
            penerbitMap.put(nama, id_penerbit);

            // Tambahkan nama ke JComboBox
            nama_penerbit.addItem(nama);
            }
        } catch (SQLException ex) {
            // Tampilkan error (debugging)
            
        }
    }

   

 
}
