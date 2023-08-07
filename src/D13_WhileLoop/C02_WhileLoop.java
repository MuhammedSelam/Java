package D13_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

        public static void main(String[] args) {

            // Kullanicidan toplanmak uzere sayilar isteyin
            // toplam 500 olur veya gecerse toplami yazdirin.


            Scanner scanner = new Scanner(System.in);

            int sayi = 0;
            int toplam = 0;

            while (toplam <= 500) {
                System.out.println("Lutfen toplamak uzere sayi giriniz");
                sayi = scanner.nextInt();
                toplam += sayi;
            }

            System.out.println("Girilen sayilarin toplami: " + toplam);
        }
    }
