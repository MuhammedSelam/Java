package D11_forLoop;

import java.util.Scanner;

public class C10_forLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen 20'den kucuk bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi >= 20) {
            System.out.println("Lutfen 20'den kucuk bir sayi giriniz");
        } else {
            int faktoriyel = 1;
            System.out.print(sayi + "! = ");

            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
                System.out.print(i);
                if (i < sayi) {
                    System.out.print(" * ");
                }
            }

            System.out.println(" = " + faktoriyel);

        }

    }
}
