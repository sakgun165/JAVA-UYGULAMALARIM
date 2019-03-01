
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
    Scanner scanner=new Scanner(System.in);
         
        double s1=scanner.nextDouble();
        double s2=scanner.nextDouble();
        String tercih=scanner.next();
        System.out.println("--------");
        switch(tercih)
        {
            case "+":System.out.println((double)s1+s2); break;
            case "-":System.out.println((double)s1-s2); break;
            case "x":System.out.println((double)s1*s2); break;
            case "/":System.out.println((double)s1/s2); break;
        }
    
    
    }
    
}
