
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Hangi sayının faktöriyelini almak istiyorsunuz? ");
        int sayı=scanner.nextInt();
        int faktoriyel=1;
        /*For Döngüsüyle Yapılışı:
        for(int i=1;i<=sayı;i++)
        {
        faktoriyel*=i;
        }
        While döngüsüyle yapılışı*/
        int i=1;
        while(i<=sayı)
        {
        faktoriyel*=i;
        i++;
        }
        System.out.println("Sonuç: "+faktoriyel);
    
    }
}
