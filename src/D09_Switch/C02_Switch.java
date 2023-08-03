package D09_Switch;

import java.util.Scanner;

public class C02_Switch {

    public static void main(String[] args) {

        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

                Scanner scanner = new Scanner(System.in);

                System.out.print("Lutfen bir 2 basamakli sayi giriniz (10-99 arasi): ");
                int sayi = scanner.nextInt();

                if (sayi < 10 || sayi > 99) {
                    System.out.println("Gecersiz giris! Lutfen 2 basamakli bir sayi giriniz.");
                    return;
                }

                int birlerBasamagi = sayi % 10;
                int onlarBasamagi = sayi / 10;

                String yaziyla = "";

                switch (onlarBasamagi) {
                    case 1:
                        yaziyla += "on";
                        break;
                    case 2:
                        yaziyla += "yirmi";
                        break;
                    case 3:
                        yaziyla += "otuz";
                        break;
                    case 4:
                        yaziyla += "kirk";
                        break;
                    case 5:
                        yaziyla += "elli";
                        break;
                    case 6:
                        yaziyla += "altmis";
                        break;
                    case 7:
                        yaziyla += "yetmis";
                        break;
                    case 8:
                        yaziyla += "seksen";
                        break;
                    case 9:
                        yaziyla += "doksan";
                        break;
                }

                switch (birlerBasamagi) {
                    case 1:
                        yaziyla += " bir";
                        break;
                    case 2:
                        yaziyla += " iki";
                        break;
                    case 3:
                        yaziyla += " uc";
                        break;
                    case 4:
                        yaziyla += " dort";
                        break;
                    case 5:
                        yaziyla += " bes";
                        break;
                    case 6:
                        yaziyla += " alti";
                        break;
                    case 7:
                        yaziyla += " yedi";
                        break;
                    case 8:
                        yaziyla += " sekiz";
                        break;
                    case 9:
                        yaziyla += " dokuz";
                        break;
                }

                System.out.println("Girdiginiz sayinin yazilisi: " + yaziyla);


    }
}
