package D005_matematikselIslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {


        // Kullanicidan 3 basamakli bir sayi alip, sayinin rakamlarini toplayip yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilenSayi = girilenSayi / 10 ;

        birlerBasamagi = girilenSayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;

        birlerBasamagi = girilenSayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi ;

        girilenSayi = girilenSayi / 10 ;

        System.out.println("Rakamlar toplami : " + rakamlarToplami);
    }
}
