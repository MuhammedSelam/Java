package D04_dataCasting__WrapperClass;

import java.util.Scanner;

public class C08_bolmeIslemi {

    public static void main(String[] args) {

        // kullanicidan iki int deger alip
        // bunlari birbirine bolun ve sonucu double olarak yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scanner.nextInt();

        double sonuc = (double) sayi1 / sayi2;
        System.out.println("Bolme isleminin sonucu: " + sonuc);

    }
}
