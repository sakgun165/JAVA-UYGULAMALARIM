
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
    int anapara;
    int yil;
    double faiz=6; 
    System.out.print("Anapara: ");
        anapara=scanner.nextInt();
        System.out.println("Kaç Yıl: ");
        yil=scanner.nextInt();
    for(int i=1;i<=yil;i++)
    {
        System.out.println(i+". yıl sonundaki toplam para miktarı: "+(anapara+(anapara*i*faiz)/100));
        
    }
    
    }
}
