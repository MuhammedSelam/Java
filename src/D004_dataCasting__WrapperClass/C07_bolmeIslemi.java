package D004_dataCasting__WrapperClass;

import java.util.Scanner;

public class C07_bolmeIslemi {

    public static void main(String[] args) {

        // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        double bolum = sayi1 / sayi2;
        int tamKisim = (int) bolum;

        System.out.println("Bolum isleminin tam sayi kismi: " + tamKisim);


        /*

        int bolmeSonucuTamsayi= (int)(sayi1/ sayi2) ;

        System.out.println(bolmeSonucuTamsayi);

         */

    }
}
