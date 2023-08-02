package D03_Scanner;

import java.util.Scanner;

public class C02_ucFarkliDataTurundeDeferYazdirma {

    public static void main(String[] args) {

        // Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tamsayı (int) değeri alıyoruz
        System.out.println("Lütfen bir tamsayı giriniz");
        int tamsayi = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı (double) değeri alıyoruz
        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double ondalikliSayi = scanner.nextDouble();

        //scanner.nextInt() veya nextDouble ile değer aldıktan sonra
        // scanner.nextLine(); ile değer istenirse sorun çıkıyor.
        // Atlama problemi oluşuyor, Sorunu çözmek için scanner.nextLine() 'i yaziyoruz.
        scanner.nextLine();

        // Kullanıcıdan metin (String) değeri alıyoruz
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();

        // Girilen değerleri ekrana yazdırıyoruz
        System.out.println("Girilen tamsayı: " + tamsayi);
        System.out.println("Girilen ondalıklı sayı: " + ondalikliSayi);
        System.out.println("Girilen metin: " + metin);

    }
}
