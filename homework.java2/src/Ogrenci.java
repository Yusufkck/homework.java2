public class Ogrenci {
    private String ad;
    private String bolum;
    private double gano;
    private int girisYili;
    private String ogrNo;
    private String bolumKodu;
    private String girisSirasi;
    public Ogrenci(){

    }
    public Ogrenci(Ogrenci ogrenci){
        this.ad = ogrenci.ad;
        this.bolum = ogrenci.bolum;
        this.girisYili = ogrenci.girisYili;
        this.bolumKodu = ogrenci.bolumKodu;
        this.gano = ogrenci.gano;
        this.girisSirasi = ogrenci.girisSirasi;
        this.ogrNo = ogrenci.ogrNo;
    }
    public Ogrenci(String ad , String bolum){
        this.ad = ad;
        this.bolum = bolum;
    }
    public Ogrenci(String ad , String bolum , int girisYili , String bolumKodu , String girisSirasi ,  double gano){
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;
        this.gano = gano;
        this.ogrNo = ogrenciNoOluştur();
        this.girisSirasi = girisSirasi;
    }
    public String getAd() {
        return ad;
    }

    public String getBolum() {
        return bolum;
    }

    public double getGano() {
        return gano;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setGano(double gano) {
        this.gano = gano;
        if (this.gano<0 || this.gano>4)
            throw new IllegalArgumentException("Girilen gano geçersizdir!!!");
    }
    public String ogrenciNoOluştur(){
        return (girisYili + bolumKodu + girisSirasi);
    }
    public double harcHesapla(int derssayisi){
        return derssayisi * 200;
    }
    public double harcHesapla(int derssayisi , double uzatilanyil){
        return (derssayisi * 200) + (uzatilanyil * 500);
    }
}
