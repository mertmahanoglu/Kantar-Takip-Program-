
package swingokulprojesicifttablolu;

public class AracBilgileri {
    
   private String plaka;
   private int girisAgirligi;
   private String girisSaati;
   private String girisTarihi;
   private String soför;
   private int cikisAgirligi;
   private String cikisSaati;
   private String cikisTarihi;
   private String marka;
   private String kayiteden;
   private int aracnumarasi;

  
   

    public AracBilgileri(String plaka, String soför, int cikisAgirligi, String cikisSaati, String cikisTarihi, String marka, String kayiteden, int aracnumarasi) {
        this.plaka = plaka;
        this.soför = soför;
        this.cikisAgirligi = cikisAgirligi;
        this.cikisSaati = cikisSaati;
        this.cikisTarihi = cikisTarihi;
        this.marka = marka;
        this.kayiteden = kayiteden;
        this.aracnumarasi = aracnumarasi;
    }

    public AracBilgileri(int aracnumarasi,String plaka, int girisAgirligi, String girisSaati, String girisTarihi, String soför, String kayiteden,String marka ) {
        this.plaka = plaka;
        this.girisAgirligi = girisAgirligi;
        this.girisSaati = girisSaati;
        this.girisTarihi = girisTarihi;
        this.soför = soför;
        this.kayiteden = kayiteden;
        this.aracnumarasi = aracnumarasi;
        this.marka = marka;
    }

    public int getCikisAgirligi() {
        return cikisAgirligi;
    }

    public void setCikisAgirligi(int cikisAgirligi) {
        this.cikisAgirligi = cikisAgirligi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKayiteden() {
        return kayiteden;
    }

    public void setKayiteden(String kayiteden) {
        this.kayiteden = kayiteden;
    }

    public int getAracnumarasi() {
        return aracnumarasi;
    }

    public void setAracnumarasi(int aracnumarasi) {
        this.aracnumarasi = aracnumarasi;
    }
   
   

    public AracBilgileri(String plaka, int girisAgirligi, String girisSaati, String girisTarihi, String soför, int cikisAgirligi, String cikisSaati, String cikisTarihi) {
        this.plaka = plaka;
        this.girisAgirligi = girisAgirligi;
        this.girisSaati = girisSaati;
        this.girisTarihi = girisTarihi;
        this.soför = soför;
        this.cikisAgirligi = cikisAgirligi;
        this.cikisSaati = cikisSaati;
        this.cikisTarihi = cikisTarihi;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public int getGirisAgirligi() {
        return girisAgirligi;
    }

    public void setGirisAgirligi(int girisAgirligi) {
        this.girisAgirligi = girisAgirligi;
    }

    public String getGirisSaati() {
        return girisSaati;
    }

    public void setGirisSaati(String girisSaati) {
        this.girisSaati = girisSaati;
    }

    public String getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(String girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public String getSoför() {
        return soför;
    }

    public void setSoför(String soför) {
        this.soför = soför;
    }

    public int getCikisagirligi() {
        return cikisAgirligi;
    }

    public void setCikisagirligi(int girisagirligi) {
        this.cikisAgirligi = girisagirligi;
    }

    public String getCikisSaati() {
        return cikisSaati;
    }

    public void setCikisSaati(String cikisSaati) {
        this.cikisSaati = cikisSaati;
    }

    public String getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(String cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }
   
    
    
}
