package D010_StringManipulations;

import java.util.Scanner;

public class C07_contains {

    public static void main(String[] args) {

        // Kullanicidan bir cumle alin
        // cumlede ev geciyorsa, "home home sweet home" yazdirin
        // cumlede is geciyorsa, "calismak guzeldir"
        // ikisini de iceriyorsa "Hem ev lazim hem is"
        // hicbirini icermiyorsa "cok calisman lazim" yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle girin");
        String cumle= scanner.nextLine().toLowerCase();

        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("Hem ev lazim hem is");
        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir");
        }else {
            System.out.println("cok calisman lazim");
        }

    }
}
