package D08_Ternary;

import java.util.Scanner;

public class C09_NestedTernary {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olanib yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden
        // uygun olani yazdirin



        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println( sayi > 0
                ?
                sayi % 2 == 0 ? "Cift sayi" : "Tek sayi"
                :
                sayi < -99 && sayi > -1000 ? "Sayi negatif ve 3 basamaklidir." : "Sayi negatif ve 3 basamakli degildir.");


    }
}
