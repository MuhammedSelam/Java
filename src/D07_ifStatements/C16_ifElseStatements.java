package D07_ifStatements;

import java.util.Scanner;

public class C16_ifElseStatements {

    public static void main(String[] args) {

        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        // istedigi birim metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen mesafeyi kilometre olarak girin");
        double mesafeKilometre = scanner.nextDouble();

        System.out.println("Lutfen hangi birime cevirmek istersiniz? (metre/santimetre)");
        String birim = scanner.next();


        if (birim.equalsIgnoreCase("metre")) {
            double mesafeMetre = mesafeKilometre * 1000;
            System.out.println("Sonuc: " + mesafeMetre + " metre");

        } else if (birim.equalsIgnoreCase("santimetre")) {
            double mesafeSantimetre = mesafeKilometre * 100000;
            System.out.println("Sonuc: " + mesafeSantimetre + " santimetre");

        } else {
            System.out.println("İstediginiz birim sisteme kayitli degil.");
        }

    }
}
