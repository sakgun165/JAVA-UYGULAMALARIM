
import java.util.Scanner;


public class Main {
 public static void main(String[] args)
 {
 String kadi="sakgun165";
 String sifre="1398senem";
 String kadi1;
 String sifre1;
 Scanner scanner=new Scanner(System.in);
     System.out.println("GİRİŞ YAP");
 while(true)
 {
     System.out.print("Kullanıcı adı: ");
     kadi1=scanner.nextLine();
     System.out.print("Şifre: ");
     sifre1=scanner.nextLine();
     if(kadi.matches(kadi1)&&sifre.matches(sifre1))
     { 
     System.out.println("Giriş Yapıldı "+kadi);
     break;
     }
     else
     {
     System.out.println("Yanlış kullanıcı adı veya şifre. Tekrar deneyiniz.");
     continue;
     }
 
 }
 
 
 }
}
