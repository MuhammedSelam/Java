package D07_ifStatements;

import java.util.Scanner;

public class C10_IfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char karakter= scanner.next().charAt(0);

        if ('A' <= karakter && karakter<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }


        /*

         boolean buyukHarfMi = Character.isUpperCase(karakter);

        if (buyukHarfMi) {
            System.out.println("Girilen karakter buyuk harftir.");
        } else {
            System.out.println("Girilen karakter buyuk harf degildir.");
        }

         */

    }
}
