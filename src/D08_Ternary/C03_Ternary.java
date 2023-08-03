package D08_Ternary;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir sayi girin: ");
        int sayi = scanner.nextInt();

        String sonuc = (sayi % 5 == 0) ? "Sayi 5'in tam kati." : "Sayi 5'in tam kati degil.";

        System.out.println(sonuc);
    }

}
