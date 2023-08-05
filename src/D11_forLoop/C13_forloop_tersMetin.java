package D11_forLoop;

import java.util.Scanner;

public class C13_forloop_tersMetin {

    public static void main(String[] args) {

        // (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen tersten yazdirmak istediginiz metni giriniz");
        String str = scanner.nextLine();

        System.out.print("Metnin tersi: ");
        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print(str.charAt(i));
        }


        /*
        // terse cevrilmis halini kaydedelim
        String tersMetin = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            tersMetin += str.charAt(i);
        }

        System.out.println("Terse cevrilen metin : " + tersMetin);
         */

    }
}
