package D07_ifStatements;

import java.util.Scanner;

public class C11_IfElseStatement {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen harf kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf girin");
        char harf = scanner.next().charAt(0);

        if ('a' <= harf && harf <= 'z'){
            System.out.println("Girilen kucuk harfin yeni hali: " + Character.toUpperCase(harf));
        }else {
            System.out.println("Girilen harf: " + harf);
        }


        /*

        if (Character.isLowerCase(harf)) {

            char buyukHarf = Character.toUpperCase(harf);
            System.out.println("Girilen kucuk harfin yeni hali: " + buyukHarf);

        } else {
            System.out.println("Girilen harf: " + harf);
        }
         */

    }
}
