package D004_dataCasting;

import java.util.Scanner;

public class C06_byteDegerineDonusturme {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        // o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        byte donusensayi= (byte)girilenSayi;

        System.out.println("girdiginiz " + girilenSayi + "'nin donusmus hali: " + donusensayi);


    }
}
