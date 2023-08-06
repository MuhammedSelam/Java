package D12_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C03_methodOlusturma {

    public static void main(String[] args) {

        // Kullanicidan main method icinde 2'den buyuk pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “true” veya “false” sonuclarini
        // donduren bir method olusturun.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen asal sayi kontrolu icin pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(asalSayiMi(sayi));


    }

    public static boolean asalSayiMi(int sayi){

        String flag = "asal sayi";
        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                flag = "asal degil";
                break;
            }
        }

        if(sayi == 2){
            return true;
        }else if (flag.equals("asal sayi")){
            return true;
        }else{
            return false;
        }

    }
}
