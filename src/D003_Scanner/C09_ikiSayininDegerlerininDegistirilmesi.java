package D003_Scanner;

import java.util.Scanner;

public class C09_ikiSayininDegerlerininDegistirilmesi {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan
        // ikisinin degerlerini degistirin(swap).
        //
         Scanner scanner = new Scanner(System.in);

         System.out.println("Lutfen ilk sayiyi giriniz");
         int sayi1 = scanner.nextInt();

         System.out.println("Lutfen ikinci sayiyi giriniz");
         int sayi2 = scanner.nextInt();

         // değerleri degistiriyoruz
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("ilk sayinin yeni degeri: " + sayi1 +
                    "\nikinci sayinin yeni degeri: " + sayi2);

    }
}
