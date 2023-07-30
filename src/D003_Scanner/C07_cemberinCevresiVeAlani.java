package D003_Scanner;

import java.util.Scanner;

public class C07_cemberinCevresiVeAlani {

    public static void main(String[] args) {

        // Kullanicidan bir cemberin yaricapini alip,
        // cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap = scanner.nextDouble();

        double pi = 3.14;
        double cevre = 2 * pi * yaricap;
        double alan = pi * yaricap * yaricap;

        System.out.println("Cemberin cevresi: " + cevre);
        System.out.println("Cemberin alani: " + alan);

    }
}
