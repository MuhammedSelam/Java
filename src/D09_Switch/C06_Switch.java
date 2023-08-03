package D09_Switch;

import java.util.Scanner;

public class C06_Switch {

    public static void main(String[] args) {


        // Kullanicidan ay numarasini alip mevsimi yazdirin.

                Scanner scanner = new Scanner(System.in);

                System.out.print("Lutfen bir ay numarasi giriniz (1-12 arasi): ");
                int ayNumarasi = scanner.nextInt();

                 switch (ayNumarasi){
                     case 12 :
                     case 1 :
                     case 2 :
                           System.out.println("Kis");
                           break;
                     case 3 :
                     case 4 :
                     case 5 :
                           System.out.println("Ilkbahar");
                           break;
                     case 6 :
                     case 7 :
                     case 8 :
                           System.out.println("Yaz");
                           break;
                     case 9  :
                     case 10 :
                     case 11 :
                            System.out.println("Sonbahar");
                            break;
                     default:
                            System.out.println("Gecersiz ay numarasi");

                 }

                /*

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

                 */

    }
}
