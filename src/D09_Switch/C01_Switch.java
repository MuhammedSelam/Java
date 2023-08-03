package D09_Switch;

import java.util.Scanner;

public class C01_Switch {

    public static void main(String[] args) {


               // Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

                Scanner scanner = new Scanner(System.in);

                System.out.print("Lutfen bir rakam giriniz (0-9 arasi): ");
                int rakam = scanner.nextInt();

                String yaziyla = "";

                switch (rakam) {
                    case 0:
                        yaziyla = "sifir";
                        break;
                    case 1:
                        yaziyla = "bir";
                        break;
                    case 2:
                        yaziyla = "iki";
                        break;
                    case 3:
                        yaziyla = "uc";
                        break;
                    case 4:
                        yaziyla = "dort";
                        break;
                    case 5:
                        yaziyla = "bes";
                        break;
                    case 6:
                        yaziyla = "alti";
                        break;
                    case 7:
                        yaziyla = "yedi";
                        break;
                    case 8:
                        yaziyla = "sekiz";
                        break;
                    case 9:
                        yaziyla = "dokuz";
                        break;
                    default:
                        yaziyla = "Gecersiz rakam girdiniz";
                        break;
                }

                System.out.println("Girdiginiz rakamin yazilisi: " + yaziyla);

    }
}
