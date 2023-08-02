package D05_matematikselIslemler_increment;

public class C04_Increment_Decrement {

    public static void main(String[] args) {

        int sayi = 20;

        // sayi variable'nin degerini 3 katinin 8 fazlasi yapin

        sayi = sayi * 3 + 8 ;

        System.out.println(sayi); // 68

        // 2.yontem
        sayi = 20;
        sayi *= 3;
        sayi += 8;

        System.out.println(sayi); // 68


        int a = 10;

        int b = a;
        a++;
        System.out.println("a : " + a + " b : " + b); // a : 11 b : 10


        a= 10;
        a++;
        b = a ;
        System.out.println("a : " + a + " b : " + b); // a : 11 b : 11
    }
}
