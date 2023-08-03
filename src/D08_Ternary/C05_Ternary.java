package D08_Ternary;

import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");
        char harf = scanner.next().charAt(0);

        System.out.println (harf >= 'a' && harf <= 'z'
                ? Character.toUpperCase(harf)
                : harf);


        /*

        char sonuc = (Character.isLowerCase(harf)) ? Character.toUpperCase(harf) : harf;
        System.out.println("Sonuç: " + sonuc);

         */

    }
}
