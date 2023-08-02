package D005_matematikselIslemler_increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alip, sayinin rakamlarini toplayip yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen uc basamakli bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = sayi / 100;

        int toplam = birlerBasamagi + onlarBasamagi + yuzlerBasamagi;

        System.out.println("Girilen sayinin rakamları toplamı: " + toplam);
    }

}
