package D11_forLoop;

import java.util.Scanner;

public class C06_forLoop {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alin,
        // 1’den girilen sayiya kadar(girilen sayi dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir pozitif tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("1'den " + sayi + "'e kadar 7'ye tam bolunebilen sayilar:");
        for (int i = 1; i <= sayi; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
