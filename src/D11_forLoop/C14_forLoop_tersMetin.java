package D11_forLoop;

import java.util.Scanner;

public class C14_forLoop_tersMetin {

    public static void main(String[] args) {

        // (interview)- Kullanicidan bir String isteyin
        // ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen tersten yazdirmak istediginiz metni giriniz");
        String str = scanner.nextLine();

        // Metni tersine cevirmek icin yeni bir String olusturuyoruz
        String tersMetin = "";

        // Metni tersten dolasarak yeni String'e ekliyoruz
        for (int i = str.length() - 1; i >= 0 ; i--) {
            tersMetin += str.charAt(i);
        }

        System.out.println("Terse cevrilen metin : " + tersMetin);

    }
}
