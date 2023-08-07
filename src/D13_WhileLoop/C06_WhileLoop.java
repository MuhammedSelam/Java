package D13_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

    public static void main(String[] args) {

        // While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen rakamlar toplamini bulmak istediginiz sayiyi yaziniz");
        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while (sayi > 0){
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }

        System.out.println("girilen " + girilenSayi + "'nin rakamlar toplami : " + rakamlarToplami);
    }
}
