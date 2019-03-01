
import java.util.Scanner;


public class Main {
   public static void main(String[] args)
   {
   /* VKİ=KİLO/BOY*BOY
       */
       Scanner scanner=new Scanner(System.in);
       System.out.print("Cinsiyet(Kadın/Erkek): ");
       String cinsiyet=scanner.nextLine();
       System.out.print("Kilo(örn:56,7) : ");
       double kilo=scanner.nextDouble();
       System.out.print("Boy(örn:165) : ");
       double boy=scanner.nextDouble();
       double vki=kilo/((boy/100)*(boy/100));
       System.out.println("Vücut Kitle İndeksiniz: "+vki);
       if(cinsiyet.matches("K")&&vki<19.1)
       {
           System.out.println("Zayıf, ideal kilonun altında.");
       }
       else if(cinsiyet.matches("E")&&vki<20.7)
       {
       System.out.println("Zayıf, ideal kilonun altında.");
       }
       else if(cinsiyet.matches("K")&&(vki>19.1&&vki<25.8))
       {
       System.out.println("Normal, ideal kilo.");
       }
       else if(cinsiyet.matches("E")&&(vki>20.7&&vki<26.4))
       {
       System.out.println("Normal, ideal kilo.");
       }
       else if(cinsiyet.matches("K")&&(vki>25.9&&vki<27.3))
       {
       System.out.println("Hafif şişman,toplu.");
       }
       else if(cinsiyet.matches("E")&&(vki>26.5&&vki<27.8))
       {
       System.out.println("Hafif şişman,toplu.");
       }
       else if(cinsiyet.matches("K")&&(vki>27.4&&vki<32.2))
       {
       System.out.println("Şişman,risk grubuna girebilir.");
       }
       else if(cinsiyet.matches("E")&&(vki>27.9&&vki<31.2))
       {
       System.out.println("Şişman,risk grubuna girebilir.");
       }
       else if(cinsiyet.matches("K")&&(vki>32.3&&vki<44.8))
       {
       System.out.println("Obez ve aşırı şişmanlık.");
       }
       else if(cinsiyet.matches("E")&&(vki>31.2&&vki<45.4))
       {
       System.out.println("Obez ve aşırı şişmanlık.");
       }
       else if(cinsiyet.matches("K")&&(vki>44.8))
       {
       System.out.println("Çok riskli obez.");
       }
        else if(cinsiyet.matches("E")&&(vki>45.4))
       {
       System.out.println("Çok riskli obez.");
       }
       else
        {
            System.out.println("Bilgilerinizi doğru girdiğinizden emin olunuz.");
        }
   
   }
}
