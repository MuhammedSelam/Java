package D07_ifStatements;

import java.util.Scanner;

public class C17_nestedIfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        // sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();


        if (sayi % 2 == 1) {
            if (sayi > 0) {
                System.out.println("Sayi pozitif ve tek.");
            } else {
                System.out.println("Sayi negatif ve tek.");
            }

        } else {
            if (sayi % 10 == 0) {
                System.out.println("Sayi cift ve 10'un tam kati.");
            } else {
                System.out.println("Sayi cift ancak 10'un tam kati degil.");
            }
        }

    }
}
