
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Bir pozitif tam sayı giriniz: ");
        int sayı=scanner.nextInt();
        int toplam=0;
        do{
        toplam+=sayı%10;
        System.out.println("sayı:"+sayı);
        sayı=sayı/10;
            
        }while(sayı>0);
        System.out.println("Rakamlar toplamı: "+toplam);
    
    }
}
