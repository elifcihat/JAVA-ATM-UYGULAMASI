
import java.util.Scanner;


public class ATM {
    
    
    public void calis(Hesap hesap)
    {
        Login login=new Login();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("****************************");
        int girishakki=3;
        while(true)
        {
            if(login.login(hesap))
            {
                System.out.println("Giriş Başarılı...");
                break;
            }
            else
            {
                System.out.println("Giriş Başarısız...");
                girishakki-=1;
                System.out.println("Kalan Giriş Hakkınız "+girishakki);
            }
            if(girishakki==0)
            {
                System.out.println("Giriş Hakkınız Sonlandı");
                return;
            }
        }
        
        System.out.println("*******************************");
        String islemler="1- Bakiye Görüntüle\n"
        +"2- Para Çekme\n"
        +"3- Para Yatırma\n"
        + "Çıkış için q 'ya basın";
        System.out.println(islemler);
        
        while(true)
        {
            System.out.println("Yapmak istediğiniz işlemi seçiniz.");
            String islem=scanner.nextLine();
            if(islem.equals("q"))
            {
                
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            }
            else if(islem.equals("2"))
            {
                System.out.println("Çekmek istediğiniz tutarı tuşlayınız: ");
                int mik=scanner.nextInt();
                scanner.nextLine();
                hesap.Paracek(mik);
            }
            else if(islem.equals("3"))
            {
                System.out.println("Yatırmak istediğiniz tutar:  ");
                int mik=scanner.nextInt();
                scanner.nextLine();
                hesap.Parayatir(mik);
            }
            else
            {
                System.out.println("Hatalı tuşlama yapıldı...");
            }
            
        }
        
        
    }
}
