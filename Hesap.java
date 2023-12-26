
public class Hesap {
    
    private String kullaniciadi;
    private int bakiye;
    private String parola;
    
    
    
    public Hesap(String kullaniciadi,int bakiye,String parola)
    {
        this.kullaniciadi=kullaniciadi;
        this.bakiye=bakiye;
        this.parola=parola;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    
    public void Parayatir(int miktar)
    {
        bakiye+=miktar;
        System.out.println("Yeni Bakiyeniz:  "+bakiye);
    }
    
    public void Paracek(int miktar)
    {
        if(bakiye-miktar<0)
        {
            System.out.println("Yeterli bakiyeniz bulunmamaktadır... Güncel Bakiye:  "+bakiye);
        }
        else
        {
            bakiye-=miktar;
            System.out.println("Yeni Bakiyeniz:  "+bakiye);
        }
        
        
    }
    
}
