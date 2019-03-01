
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
        System.out.print("Araç km başına kaç kr yakıyor(örn:0,60): ");
        double kr=scanner.nextDouble();
        System.out.print("Araç kaç km yol yaptı/yapacak(örn:450): ");
        double km=scanner.nextDouble();
        double tutar=km*kr;
        System.out.println("Ödenecek miktar: "+tutar+" TL'dir.");
    
    
    }
}
