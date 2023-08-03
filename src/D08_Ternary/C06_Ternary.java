package D08_Ternary;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        // Kullanicidan notunu alin
        // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen notunuzu giriniz: ");
        int not = scanner.nextInt();

        System.out.println(not >= 50 ? "Sınıfı Geçtin" : "Maalesef Kaldın");

    }
}
