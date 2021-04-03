/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingokulprojesicifttablolu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mert
 */
public class DbGiris {
    public int aracSayisi =0;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public void aracGuncelle(int id,String plaka,int cikisAgirligi,String cikisSaati,String cikisTarihi)
    {
    String sorgu = "Update aractablosu set cikisagirligi=? , cikissaati =? , cikistarihi = ? where id =?";
    
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, cikisAgirligi);
             preparedStatement.setString(2, cikisSaati);
              preparedStatement.setString(3, cikisTarihi);
               preparedStatement.setInt(4, id);
               
               preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void aracEkleGiris(String plaka,String girisAgirligi,String girisSaati, String girisTarihi,String soför,String kayiteden,String marka)
    {
        String sorgu = "Insert into aractablosu (plaka,girisagirligi,girissaati,giristarihi,soför,kayiteden,marka) VALUES(?,?,?,?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, plaka);
            preparedStatement.setString(2, girisAgirligi);
            preparedStatement.setString(3, girisSaati);
            preparedStatement.setString(4, girisTarihi);
            preparedStatement.setString(5, soför);
            preparedStatement.setString(6, kayiteden);
            preparedStatement.setString(7, marka);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    
    
    
    
    
    
     public ArrayList<CikisAracBilgileri>CikisAraclariGetir()
    {
    ArrayList<CikisAracBilgileri> cikti = new ArrayList<>();
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from aractablosu";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                
                int aracnumarasi = rs.getInt("id");
                String plaka = rs.getString("plaka");
                int girisAgirligi = rs.getInt("girisagirligi");
                String girisZamaniSaat = rs.getString("girissaati");
                String girisZamaniTarih = rs.getString("giristarihi");
                int cikisAgirligi = rs.getInt("cikisagirligi");
                String cikisZamaniSaat = rs.getString("cikissaati");
                String cikisZamaniTarih = rs.getString("cikistarihi");
                String soför = rs.getString("soför");          
                String kayiteden = rs.getString("kayiteden");
                String marka = rs.getString("marka");
                
               cikti.add(new CikisAracBilgileri(aracnumarasi, plaka, cikisAgirligi,girisAgirligi,girisZamaniSaat,girisZamaniTarih ,cikisZamaniSaat, cikisZamaniTarih, soför, kayiteden, marka));
               aracSayisi++;
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(DbGiris.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }

    public ArrayList<AracBilgileri>GirisAraclariGetir()
    {
    ArrayList<AracBilgileri> cikti = new ArrayList<>();
    
        try {
            statement = con.createStatement();
            String sorgu = "Select * from aractablosu";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            
            while (rs.next()) { 
                
                int aracnumarasi = rs.getInt("id");
                String plaka = rs.getString("plaka");
                int girisAgirligi = rs.getInt("girisagirligi");
                String girisZamaniSaat = rs.getString("girissaati");
                String girisZamaniTarih = rs.getString("giristarihi");
                String soför = rs.getString("soför");          
                String kayiteden = rs.getString("kayiteden");
                String marka = rs.getString("marka");
                
                cikti.add(new AracBilgileri(aracnumarasi,plaka, girisAgirligi, girisZamaniSaat, girisZamaniTarih, soför, kayiteden,marka));
                
               
            }
            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(DbGiris.class.getName()).log(Level.SEVERE, null, ex);
            
            return  null;
        }
    
    }
    public boolean girisYap(String kullaniciAdi,String parola)
    {
    String sorgu = "Select * from kullanicilar where kullaniciAdi=? and parola =? ";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DbGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public DbGiris() {
        
         String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + "/" + Veritabani.db_ismi + "?useUnicode=true&characterEncoding=utf8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Bulunamadı");
        }
        try {
            con = DriverManager.getConnection(url, Veritabani.kullanici_adi, Veritabani.parola);
            System.out.println("Bağlantı Başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısırz.");
        }
    }
    
    
    
     public void kayitEkle(String kullaniciadi,String parola)
    {
        String sorgu = "Insert into kullanicilar (kullaniciAdi,parola) VALUES(?,?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullaniciadi);
            preparedStatement.setString(2, parola);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
     public void aracSil(int id)
     {
     String sorgu = "Delete from aractablosu where id=?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
             preparedStatement.setInt(1, id);
             preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
    
     }
    
   
   
    
    public static void main(String[] args) {
        
        DbGiris dbGiris = new DbGiris();
        
        
    }
    
    
    
}
