package D004_dataCasting;

public class C03_CharDataCasting {

    public static void main(String[] args) {

        char ch= 'b';
        int sayi = ch;
        System.out.println("ch1: " + ch); // b
        System.out.println("sayi: " + sayi); // 98

        char ch1 = 'd';
        char ch2 = 'i';
        System.out.println(ch1 + ch2); // 100 + 105 = 205

        // int bir sayinin ascii tablosundaki char karsiligini yazdirin
        int karakter = 50;
        char asciDegeri = (char)karakter;
        System.out.println("Verilen sayinin ascii tablosundaki karsiligi: "+ asciDegeri); // 2

    }
}
