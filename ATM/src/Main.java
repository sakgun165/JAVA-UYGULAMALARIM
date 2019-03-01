
import java.util.Scanner;


public class Main {
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
int bakiye=0;
int tercih;
do{
    System.out.println("1-PARA ÇEKME\n2-PARA YATIRMA\n3-BAKİYE SORGULAMA\n4-ÇIKIŞ");
    System.out.println("************************");
    System.out.print("Tercihiniz:");
    tercih=scanner.nextInt();
switch(tercih){
    case 1:System.out.println("Tutarı giriniz:"); 
           int tutar=scanner.nextInt();
           if(bakiye>0)
           {bakiye-=tutar;}
           if(bakiye==0||bakiye<tutar)
           { System.out.println("Bakiye yetersiz.");}
        break;
     case 2:System.out.println("Tutarı giriniz: ");
           int tutar1=scanner.nextInt();
           bakiye+=tutar1;
         break;
    case 3:System.out.println("Bakiyeniz:"+bakiye); break;
   
    case 4:System.out.println("Program sonlanıyor...");
           break;
    default: System.out.println("1-4 arasında bir rakam tuşlamalısınız.");
        
}}while(tercih!=4);
}
}
