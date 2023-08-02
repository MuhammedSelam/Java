package D07_ifStatements;

import java.util.Scanner;

public class C09_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olmaniz icin " + (65 - yas) + " yil daha calismaniz gerekmektedir.");
        }

        /*
        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            int kalanYil = 65 - yas;
            System.out.println("Emekli olmaniz icin " + kalanYil + " yil daha calismaniz gerekmektedir.");
        }

         */


    }
}
