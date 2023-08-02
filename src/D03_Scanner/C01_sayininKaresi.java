package D03_Scanner;

import java.util.Scanner;

public class C01_sayininKaresi {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alip, bu sayinin karesini yazdirin

        // scanner objesi olusturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullaniciya ne istedigimizi soyleyoruz
        System.out.println("Lütfen bir tamsayı giriniz");

        // Scanner ile kullanicidan bir tamsayi aliyoruz
        int girilenSayi = scanner.nextInt();

        // Girilen sayinin karesini hesaplayip ekrana yazdiriyoruz
        int karesi = girilenSayi * girilenSayi;
        System.out.println("Girilen sayının karesi: " + karesi);

    }
}
