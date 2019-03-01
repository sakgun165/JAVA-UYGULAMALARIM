
import java.util.Scanner;


public class Main {
   public static void main(String[] args) 
   {
   Scanner scanner=new Scanner(System.in);
   System.out.print("Birinci Vize: ");
   double v1=scanner.nextDouble();
   System.out.print("İkinci Vize: ");
   double v2=scanner.nextDouble();
   System.out.print("Final: ");
   double fnl=scanner.nextDouble();
   System.out.print("G.N.O: ");
   double gno=scanner.nextDouble();
       System.out.println("----------------------");
   double ort=(v1*0.3)+(v2*0.3)+(fnl*0.4);
   System.out.println("Dersin Ortalaması: "+ort);
   if(ort>=90)
   {
       System.out.println("AA");
   }
   else if(ort>=85)
   {
       System.out.println("AB");
   }
   else if(ort>=85)
   {
       System.out.println("BA");
   }
   else if(ort>=80)
   {
       System.out.println("BB");
   }
   else if(ort>=75)
   {
       System.out.println("CB");
   }
   else if(ort>=70)
   {
       System.out.println("CC");
   }
   else if(ort>=65)
   {
       System.out.println("DC");
   }
   else if(ort>=60)
   {
       System.out.println("DD");
       if(gno<=2.50)
       {
           System.out.println("Not ortalamanız düşük.");
       }
   }
   else if(ort>=55)
   {
       System.out.println("FD(KALDI!)");
   }
   else
   {
       System.out.println("FF-> KALDI!");
   }
   
   }
           }
