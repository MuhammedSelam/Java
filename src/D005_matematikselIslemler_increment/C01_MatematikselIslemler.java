package D005_matematikselIslemler_increment;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        int sayi1 = 58;
        int sayi2 = 8;

        // iki tamsayiyi bolerseniz sonuc tamsayi olur
        System.out.println(sayi1 / sayi2); // 7

        System.out.println(40 / 6); // 6

        double dbl = 27;

        System.out.println(dbl / sayi2); // 3.375


        double sonuc1  = sayi1 / sayi2;

        System.out.println("Sonuc1 : " + sonuc1 ); // 7.0

        double sonuc2 = (double)(sayi1/sayi2) ;
        System.out.println("Sonuc2 : " + sonuc2 ); // 7.0


        double sonuc3 = (double)sayi1 / sayi2 ;
        System.out.println("Sonuc3 : " + sonuc3 ); // 7.25


    }
}
