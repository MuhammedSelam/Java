package D09_Switch;

import java.util.Scanner;

public class C06_Switch {

    public static void main(String[] args) {


        // Kullanicidan ay numarasini alip mevsimi yazdirin.

                Scanner scanner = new Scanner(System.in);

                System.out.print("Lutfen bir ay numarasi giriniz (1-12 arasi): ");
                int ayNumarasi = scanner.nextInt();

                String mevsim = "";

                switch (ayNumarasi) {
                    case 12:
                    case 1:
                    case 2:
                        mevsim = "Kis";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        mevsim = "İlkbahar";
                        break;
                    case 6:
                    case 7:
                    case 8:
                        mevsim = "Yaz";
                        break;
                    case 9:
                    case 10:
                    case 11:
                        mevsim = "Sonbahar";
                        break;
                    default:
                        mevsim = "Gecersiz Ay Numarasi";
                        break;
                }

                System.out.println("Girilen ayin mevsimi: " + mevsim);


    }
}
