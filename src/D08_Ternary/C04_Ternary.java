package D08_Ternary;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println( kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0
                ?
                "Eskenar ucgen"
                :
                "Eskenar degil"
        );

    }
}
