package D03_Scanner;

import java.util.Scanner;

public class C06_isimSoyisimYaslariYazdirma {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // Girilen bilgiler : a karahan, 25

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\n(Her bilgiden sonra ENTER'a basiniz)");

        char isimIlkHarf= scanner.nextLine().charAt(0);
        String soyisim= scanner.nextLine();
        double yas = scanner.nextDouble();

        System.out.println("Girilen bilgiler: " + isimIlkHarf + " " + soyisim + ", " + yas);


        /*

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        char isimIlkHarf = isim.charAt(0);

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : "+ isimIlkHarf + " " + soyisim + ", " + yas);

         */

    }
}
