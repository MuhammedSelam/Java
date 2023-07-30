package D003_Scanner;

import java.util.Scanner;

public class C04_isimSoyisimYaslariniYazdirma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip,
        // asagidaki formmatta yazdirin.
        // Isminiz: yusuf
        // Soyisminiz: Karahan
        // Yasiniz: 25
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        /*
        System.out.println("Isminiz: " + isim);
        System.out.println("Soyisminiz: " + soyisim);
        System.out.println("Yasiniz: " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");
         */

        System.out.println("Isminiz: " + isim +
                "\nSoyisminiz: " + soyisim +
                "\nYasiniz: " + yas +
                "\nKaydiniz basariyla tamamlanmistir.");

    }
}
