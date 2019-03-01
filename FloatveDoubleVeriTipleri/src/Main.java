
public class Main {
 public static void main(String[] args)
 {
 //DOUBLE=64 BİT=8 BYTE
 //FLOAT=32 BİT=8 BYTE
     //--Otomatik Dönüştürme: int-->float-->double
     double a=5.25;
     double b=4.0;
     double c=4d;
     System.out.println(c);
     float d=(float)5.0;//double olarak algıladığı için hata aldık ve kendimiz dönüştürdük.
     float e=5.2f;
     //DOUBLE İLE FLOAT FARKI?
     int f=22/7;
     float g=22f/7f;
     double h=22d/7d;
     System.out.println("int 22/7= "+f);
     System.out.println("float 22/7= "+g);
     System.out.println("double 22/7= "+h);
 }
}
