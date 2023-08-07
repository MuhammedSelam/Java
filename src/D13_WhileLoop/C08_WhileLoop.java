package D13_WhileLoop;

import java.util.Scanner;

public class C08_WhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin,
        // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin,
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        // bu negatif sayiyi sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;

        System.out.println("Lutfen pozitif tamsayilar girin, bitirmek icin 0'i tuslayin");

        while (true) {
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break;
            } else if (sayi < 0) {
                System.out.println("Negatif sayi kullanamazsiniz");
            } else {
                toplam += sayi;
                sayac++;
            }
        }

        System.out.println("Girdiginiz " + sayac + " adet pozitif tamsayinin toplami: " + toplam);

    }
}
