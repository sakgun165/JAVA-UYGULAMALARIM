
import java.util.Scanner;


public class Main {
  public static void main(String[] args)
  {
  Scanner scanner=new Scanner(System.in);
  System.out.print("a: ");
  int a=scanner.nextInt();
  System.out.print("b: ");
  int b=scanner.nextInt();
  double hipotenus=Math.sqrt((a*a)+(b*b));
  System.out.println("Hipotenüs: "+hipotenus);
  
  }
}
