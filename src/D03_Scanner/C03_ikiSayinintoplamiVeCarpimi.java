package D03_Scanner;

import java.util.Scanner;

public class C03_ikiSayinintoplamiVeCarpimi {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir double sayi giriniz");
        double doubleSayi = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");
        int tamSayi = scanner.nextInt();

        double toplam = doubleSayi + tamSayi;
        double carpim = doubleSayi * tamSayi;

        System.out.println("Iki sayinin toplami: " + toplam);
        System.out.println("Iki sayinin carpimi: " + carpim);

    }
}
