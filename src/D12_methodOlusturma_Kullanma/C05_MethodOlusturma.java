package D12_methodOlusturma_Kullanma;

public class C05_MethodOlusturma {

    public static void main(String[] args) {

        // verilen iki sayinin toplamini yazdiran bir method olusturun

        toplama(15,35);

         /*
            public : access modifier ==> erisim belirleyici
            static : ozel bir keyword'dur
            void   : return type , method'un bana bir sey dondurmeyecegini, sadece yazdiracagini belirtir
            isim   : method'un yaptigi is ile baglantili olmali
            (parametreler) : method'un yapacagi is icin bizim gondermemiz gereken degiskenler
         */

    }

    public static void toplama(int sayi1, int sayi2){

        System.out.println("Iki sayinin toplami : " + (sayi1+ sayi2));
    }
}
