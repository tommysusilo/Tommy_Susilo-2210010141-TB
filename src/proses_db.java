
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win 10
 */
public class proses_db {
 String dbURL = "jdbc:mysql://localhost/penjualan_buku";
    String user = "root";
    String pass ="";
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;
    
    public proses_db() {
         try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         try {
            con = (Connection) DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void tambah_transaksi(String id_penjualan, String id_buku, String jumlah, String harga_satuan, String total) throws SQLException {
         String sql = "insert into tb_transaksi (id_transaksi,id_penjualan,id_buku,harga_satuan,jumlah,total_harga) values (?,?,?,?,?,?)";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(1, null);
    pst.setString(2, id_penjualan);
    pst.setString(3, id_buku);
     pst.setString(5, jumlah);
     pst.setString(4, harga_satuan);
     pst.setString(6, total);
     

    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
 

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
          
        
    }
    
     
   void tambah_buku(String id_buku, String nama, String harga, String id_penerbit) throws SQLException {
         String sql = "insert into tb_buku (id_buku,nama_buku,id_penerbit,harga_buku) values (?,?,?,?)";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(1, id_buku);

    pst.setString(2, nama);
     pst.setString(3,id_penerbit);
     pst.setString(4, harga);

    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
 

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
          
        
    }
        
        
         void tambah_penerbit(String id_penerbit, String nama_penerbit) throws SQLException {
         String sql = "insert into tb_penerbit (id_penerbit,nama_penerbit) values (?,?)";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(1, id_penerbit);

    pst.setString(2, nama_penerbit);

    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
 

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
          
        
    }
    
    
    
    
    public ResultSet lihat_transaksi(){
        String sql ="SELECT * FROM tb_transaksi, tb_buku where tb_transaksi.id_buku = tb_buku.id_buku";
     try {
         st = con.createStatement();
         rs = st.executeQuery(sql);
     } catch (SQLException ex) {
         Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
     }
     return rs;
        
    }
    
     public ResultSet lihat_buku(){
        String sql ="SELECT * FROM tb_buku, tb_penerbit where tb_buku.id_penerbit = tb_penerbit.id_penerbit";
     try {
         st = con.createStatement();
         rs = st.executeQuery(sql);
     } catch (SQLException ex) {
         Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
     }
     return rs;
        
    }
     
        public ResultSet lihat_penerbit(){
        String sql ="SELECT * FROM tb_penerbit";
     try {
         st = con.createStatement();
         rs = st.executeQuery(sql);
     } catch (SQLException ex) {
         Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
     }
     return rs;
        
    }
    
    
    public void hapus(String id){
     try {
         String sql ="delete from tb_agenda where id_agenda = ?";
         pst = con.prepareStatement(sql);
         pst.setString(1,id);
         int executeUpdate = pst.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
     public void hapus_penerbit(String id){
     try {
         String sql ="delete from tb_penerbit where id_penerbit = ?";
         pst = con.prepareStatement(sql);
         pst.setString(1,id);
         int executeUpdate = pst.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
     
  
     
      public void hapus_buku(String id){
     try {
         String sql ="delete from tb_buku where id_buku = ?";
         pst = con.prepareStatement(sql);
         pst.setString(1,id);
         int executeUpdate = pst.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
      void edit(String id_agenda, String agenda, Date tanggal, String tempat) throws SQLException {
      String sql;
     sql = "update tb_agenda set nama_agenda=?, tanggal=?, tempat=? where id_agenda=?";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(4, id_agenda);

    pst.setString(1, agenda);

    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
    if (tanggal != null) {
        pst.setDate(2, new java.sql.Date(tanggal.getTime()));  // Konversi menggunakan getTime()
    } else {
        pst.setNull(2, java.sql.Types.DATE); // Jika tanggal null, set null pada parameter tanggal
    }

    pst.setString(3, tempat);

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
          
        
    }
      

    void edit_penerbit(String id_penerbit, String nama_penerbit) throws SQLException {
      String sql;
     sql = "update tb_penerbit set nama_penerbit=? where id_penerbit=?";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(2, id_penerbit);

    pst.setString(1, nama_penerbit);

    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
   

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
          
        
    }
    
    void edit_buku(String id_buku,String nama,String harga,String id_penerbit) throws SQLException {
      String sql;
     sql = "update tb_buku set nama_buku=?, id_penerbit=?, harga_buku=? where id_buku=?";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
 pst.setString(4, id_buku);

    pst.setString(1, nama);
     pst.setString(2,id_penerbit);
     pst.setString(3, harga);
    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
   

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
          
        
    }
    
    public String getLastTransactionID() throws SQLException {
    String lastID = "";
    String query = "SELECT id_penjualan FROM tb_penjualan ORDER BY id_penjualan DESC LIMIT 1";

    try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
        if (rs.next()) {
            lastID = rs.getString("id_penjualan"); // Ambil ID terakhir
        }
    }

    return lastID; // Jika kosong, akan mengembalikan string kosong
}
    
    
    public String generateNewTransactionID() throws SQLException {
    String lastID = getLastTransactionID();

    if (lastID.isEmpty()) {
        // Jika belum ada data, mulai dari T001
        return "001";
    }

    // Pisahkan prefix dan angka
    String prefix = lastID.substring(0, 1); // Ambil huruf "T"
    int number = Integer.parseInt(lastID.substring(1)); // Ambil angka setelah huruf

    // Tingkatkan angka
    number++;

    // Format ulang menjadi ID baru
    return String.format("%03d", number); // Contoh: "T002"
}

    void hapus_transaksi(String id) {
        try {
         String sql ="delete from tb_transaksi where id_transaksi = ?";
         pst = con.prepareStatement(sql);
         pst.setString(1,id);
         int executeUpdate = pst.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    void edit_transaksi(String id_transaksi_1, String id_penjualan, String kode_buku, String jumlah_, String harga_satuan, String total_harga) throws SQLException {
    String sql = "update tb_transaksi set id_buku=?, id_penjualan=?, harga_satuan=? , jumlah=?, total_harga=? where id_transaksi=?";
    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(1, kode_buku);
    pst.setString(2, id_penjualan);
     pst.setString(3, harga_satuan);
        pst.setString(4, jumlah_);
     pst.setString(5, total_harga);
        pst.setString(6, id_transaksi_1);
     

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
    }

   public int total_transaksi(String id_penjualan) throws SQLException {
    int totalSum = 0; // Variabel untuk menyimpan hasil penjumlahan
    String query = "SELECT SUM(total_harga) AS total_sum FROM tb_transaksi WHERE id_penjualan=?";
    
    // Persiapkan PreparedStatement
    try (PreparedStatement ps = con.prepareStatement(query)) {
        ps.setString(1, id_penjualan); // Set parameter id_penjualan
        
        // Eksekusi query dan ambil hasil
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                totalSum = rs.getInt("total_sum"); // Ambil nilai total dari hasil query
            }
        }
    }

    return totalSum; // Kembalikan total sum
}

    ResultSet lihat_transaksi_id(String id_jual) {
    String sql = "SELECT * FROM tb_transaksi INNER JOIN tb_buku ON tb_transaksi.id_buku = tb_buku.id_buku WHERE id_penjualan = ?";
    try {
        // Menggunakan PreparedStatement untuk query dengan parameter
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id_jual); // Set nilai parameter ke id_jual
        
        rs = ps.executeQuery(); // Eksekusi query
    } catch (SQLException ex) {
        Logger.getLogger(proses_db.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs; // Return ResultSet
}

    void tambah_penjualan(String id_jual, String total_harga, String kembalian_1, String tunai_1)throws SQLException {
       String sql = "insert into tb_penjualan (id_penjualan,total_transaksi,tunai,kembalian) values (?,?,?,?)";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(1, id_jual);
    pst.setString(2, total_harga);
     pst.setString(4, kembalian_1);
     pst.setString(3, tunai_1);

    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
 

     // Menjalankan query
     int executeUpdate = pst.executeUpdate(); // Mengeksekusi query untuk menambah data ke database
          
    }
 
    
}
