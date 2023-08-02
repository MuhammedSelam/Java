package D07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        // kullanicidan notunu isteyin
        // 50 ve uzeri ise sinifi gectin
        // degilse maalesef kaldin yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not = scanner.nextDouble();

        if (not >= 50) System.out.println ("Sinifi gectin");
        if (not < 50) System.out.println ("Maalesef kaldin");


        if (not >= 50 ){
            System.out.println("Sinifi gectin");
        } else {
            System.out.println("Maalesef kaldin");
        }

    }
}
