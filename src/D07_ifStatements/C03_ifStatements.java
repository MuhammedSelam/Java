package D07_ifStatements;

import java.util.Scanner;

public class C03_ifStatements {

    public static void main(String[] args) {

        // Kullanicidan bir pozitif tamsayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen poitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 5 == 0 ) System.out.println("Sayi 5’in tam kati");


         /*

         if (girilenSayi % 5 == 0 ) {System.out.println("Sayi 5’in tam kati");}

         */
    }
}
