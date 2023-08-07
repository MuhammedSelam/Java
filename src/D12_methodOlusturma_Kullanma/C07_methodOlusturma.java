package D12_methodOlusturma_Kullanma;

public class C07_methodOlusturma {

    public static void main(String[] args) {

        // verdigimiz bir sayinin faktoryel degerini yazdiran bir method olusturun

       faktoryelDegeri(4); // 4! = 24
       faktoryelDegeri(3); // 3! = 6

    }

    public static void faktoryelDegeri(int sayi){

        int faktoryel = 1;

        for (int i = sayi; i >= 1 ; i--) {

            faktoryel *= i;
        }

        System.out.println(sayi + "! = " + faktoryel);

    }
}
