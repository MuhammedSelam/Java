package D004_dataCasting;

public class C01_DataCasting {

    public static void main(String[] args) {

        // bir data turundeki datayi baska bir data turune cevirmeye "data casting" denir.
        // Sayisal data iceren primitive data turlerini birbirine cast edebiliriz.

        int sayi = 30;
        double dbl = 8.9;
        short sh = 76;
        byte by = 23;

        sayi = (int)dbl;
        sayi = sh;
        sayi = by;

        dbl = sayi;
        dbl = sh;
        dbl = by;

        by = (byte)dbl;
        by = (byte)sh;
        by = (byte)sayi;

        sh = (short)dbl;
        sh = (short)sayi;
        sh = by;

    }
}
