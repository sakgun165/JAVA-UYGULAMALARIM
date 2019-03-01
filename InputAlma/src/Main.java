
import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    { //Yaş yerine string girilmesi kontrolü  
    Scanner scanner=new Scanner(System.in);
    System.out.println("Lütfen Yaşınızı Giriniz: ");   
    if(scanner.hasNextInt())
    {
    int yas=scanner.nextInt();
    System.out.println("Yaşınız: "+yas); 
    }
    else
    {
        System.out.println("Lütfen bir sayı giriniz...");
    }
    
}}
