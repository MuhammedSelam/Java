package D004_dataCasting__WrapperClass;

import java.util.Scanner;

public class C09_bolmeIslemi {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir double sayi giriniz");
        double sayi1 = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi2 = scanner.nextInt();

        int tamsayiBolum = (int) (sayi1 / sayi2);

        System.out.println("Bolum isleminin tamsayı kismi: " + tamsayiBolum);

    }
}

