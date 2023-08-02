package D07_ifStatements;

import java.util.Scanner;

public class C06_ifStatements {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("ucgenin kenar uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0) {
            System.out.println("Eskenar ucgen");
        }


        /*
        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar2>0){
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar ucgen degil");
        }
         */

    }

}