package D003_Scanner;

import java.util.Scanner;

public class C08_ikiSayininDegerlerininDegistirilmesi {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi= scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi = scanner.nextInt();


        // Degisken kullanarak iki sayinin değerlerini degistiriyoruz
        int gecici = ilkSayi;
        ilkSayi = ikinciSayi;
        ikinciSayi = gecici;

        System.out.println("ilk sayinin yeni degeri: " + ilkSayi);
        System.out.println("ikinci sayinin yeni degeri: " + ikinciSayi);

    }
}
