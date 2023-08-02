package D04_dataCasting__WrapperClass;

import java.util.Scanner;

public class C05_SonrakiUcKarakter {

    public static void main(String[] args) {

        // Kullanicidan bir char isteyin
        // girilen char'dan sonraki 3 karakteri yazdirin
        // Orn : input : a   output : b,c,d

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ascii tablosundan bir karakter giriniz");
        char girilenKarakter = scanner.next().charAt(0);

        System.out.println("Girilen karakter: " + girilenKarakter);
        System.out.println("Girilen karakter'den sonraki 3 karakter: " +
                (char)(girilenKarakter+1) + ", " +
                (char)(girilenKarakter+2) + ", " +
                (char)(girilenKarakter+3));

    }
}
