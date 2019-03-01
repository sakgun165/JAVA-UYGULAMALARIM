
import java.util.Scanner;


public class Main {
   public static void main(String[] args)
   {
   Scanner scanner=new Scanner(System.in);
       System.out.print("Birinci Sayı: ");
       int s1=scanner.nextInt();
       System.out.print("İkinci Sayı: ");
       int s2=scanner.nextInt();
       System.out.print("Üçüncü sayı");
       int s3=scanner.nextInt();
       int enbyk=0;
       if(s1>s2&&s1>s3)
       {
       enbyk=s1;
       System.out.println("En büyük sayı: "+enbyk);
       }
       else if(s2>s1&&s2>s3)
       {
       enbyk=s2;
       System.out.println("En büyük sayı: "+enbyk);
       }
       else if(s3>s1&&s3>s2)
       {
       enbyk=s3;
       System.out.println("En büyük sayı: "+enbyk);
       }
       else if(s1==s2&&s1==s3)
       {
       System.out.println("Tüm sayılar eşittir.");
       }   
       
   } 
}
