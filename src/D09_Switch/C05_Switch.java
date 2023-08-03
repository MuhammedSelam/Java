package D09_Switch;

import java.util.Scanner;

public class C05_Switch {

    public static void main(String[] args) {

        // Kullanicidan gun numarasini alip
        // hafta ici veya hafta sonu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen bir gun numarasi giriniz (1-7 arasi): ");
        int gunNo = scanner.nextInt();

        switch (gunNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default :
                System.out.println("Gecersiz gun numarasi girdiniz");
        }

    }
}
