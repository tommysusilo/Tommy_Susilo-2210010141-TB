
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
    
     

    void tambah(String id_agenda, String agenda, Date tanggal, String tempat) throws SQLException {
         String sql = "insert into tb_agenda (id_agenda,nama_agenda, tanggal, tempat) values (?,?, ?, ?)";

    pst = con.prepareStatement(sql);

    // Set parameter untuk query
    pst.setString(1, id_agenda);

    pst.setString(2, agenda);

    // Mengonversi java.util.Date menjadi java.sql.Date dengan konstruktor
    if (tanggal != null) {
        pst.setDate(3, new java.sql.Date(tanggal.getTime()));  // Konversi menggunakan getTime()
    } else {
        pst.setNull(3, java.sql.Types.DATE); // Jika tanggal null, set null pada parameter tanggal
    }

    pst.setString(4, tempat);

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
        String sql ="select * from tb_transaksi";
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
    
    
    
}
