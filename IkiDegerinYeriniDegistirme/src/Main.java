
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.print("a: ");
    int a=scanner.nextInt();
    System.out.print("b: ");
    int b=scanner.nextInt();
    int gecici;
    gecici=a; //gecici=1
    a=b; //a=2
    b=gecici; //b=1
    System.out.println("a= "+a);
    System.out.println("b= "+b);
    }
}
