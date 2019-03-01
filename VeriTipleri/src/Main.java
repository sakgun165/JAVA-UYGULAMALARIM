
public class Main {
    public static void main(String[] args)
    {
    int a=4;
        System.out.println("İntegerın max value: "+Integer.MAX_VALUE);
        System.out.println("İntegerın min value: "+Integer.MIN_VALUE);
        byte b=100;
        System.out.println("Byte Max Value: "+Byte.MAX_VALUE);
        System.out.println("Byte Min Value: "+Byte.MIN_VALUE);
        short c=1000;
        System.out.println("Short Max Value: "+Short.MAX_VALUE);
        System.out.println("Short Min Value: "+Short.MIN_VALUE);
        long d=100;
        System.out.println("Long Max Value: "+Long.MAX_VALUE);
        System.out.println("Long Min Value: "+Long.MIN_VALUE);
    //byte-->short-->int-->long küçükten büyüğe
        int bolum=c/a;
        System.out.println("Bölüm: "+bolum);//JAVA OTOMATİK OLARAK VERİT TİPİ DÖNÜŞÜMÜ YAPTI.
        byte e=(byte)(b/2);//byte kaybından dolayı hata alındığı için kendimiz tip dönüşümü yaptık.
        System.out.println("e: "+e);
        long f=c+b+a;//long hepsinden büyük olduğu için hata almıyoruz.
        
        
    }
}
