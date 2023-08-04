package D010_StringManipulations;

import java.util.Scanner;

public class C02_contains {

    public static void main(String[] args) {

        // kullanicidan bir mail alin
        // mail @ icermiyorsa "gecersiz mail"
        // mail @gmail.com icermiyorsa, "mail gmail olmali"
        // mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir mail giriniz");
        String email = scan.next();

        if (!email.contains("@")){
            System.out.println("Gecersiz mail");
        }else if (!email.contains("@gmail.com")){
            System.out.println("mail gmail olmali");
        }else if (!email.endsWith("@gmail.com")){
            System.out.println("mailde yazim hatasi var");
        }

    }
}
