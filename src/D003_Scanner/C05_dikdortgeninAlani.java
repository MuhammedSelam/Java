package D003_Scanner;

import java.util.Scanner;

public class C05_dikdortgeninAlani {

    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin birinici kenar uzunlugunu giriniz");
        double kenar1 = scanner.nextDouble();

        System.out.println("Lutfen dikdortgenin ikinci kenar uzunlugunu giriniz");
        double kenar2 = scanner.nextDouble();

        double alan = kenar1 * kenar2;

        System.out.println("Dikdortgenin alani: " + alan);

    }
}
