package D08_Ternary;

import java.util.Scanner;

public class C08_Ternary {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scanner.nextDouble();

        System.out.println( sayi > 0 ? sayi : -1 * sayi);

        /*

        double mutlakDeger = (sayi >= 0) ? sayi : -sayi;
        System.out.println("Sayinin mutlak degeri: " + mutlakDeger);

         */
    }
}
