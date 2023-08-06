package D12_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C04_methodOlusturma {

    public static void main(String[] args) {

        // Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup
        // bize donduren bir method olusturun.
        // ornek : 25  pozitif tam bolenleri : 1,3,4,5,10,25 ptbs : 6

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif tam bolenleri sayisini bulmak istediginiz sayiyi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(tamBolenlerSayisi(sayi));


    }

    public static int tamBolenlerSayisi(int sayi){

        int sayac = 0;

        for (int i = 1; i <= sayi ; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }

        return sayac;
    }

}
