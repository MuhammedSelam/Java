package D010_StringManipulations;

import java.util.Scanner;

public class C03_indexOf {

    public static void main(String[] args) {

        // kullanicidan bir cumle isteyin
        // case sensitive olmadan Java kelimesi icerip icermedigini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle = scan.nextLine().toLowerCase();

        int sonuc = cumle.indexOf("java");
        // java varsa ilk java kelimesinin index'ini dondurur, yoksa, -1
        System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");


        if (cumle.indexOf("java")>=0) { // java kelimesinin index'inin 0 veya daha buyuk old.kon.ediyor

            System.out.println("Cumle java iceriyor");
        } else {
            System.out.println("Cumle Java icermiyor");
        }


    }
}
