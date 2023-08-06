package D12_methodOlusturma_Kullanma;

public class C01_MethodOlusturma {

    public static void main(String[] args) {

        /*

    Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore baslangic index'i dahil,
    bitis index'i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.

     */


        altString("Merhaba Java", 2,8); // rhaba

        altString("Guzel dusunce", 6,2);
        // Baslangic index'i bitis index'inden buyuk olamaz

        altString("Bu sehir guzeldir", 23, 26);
        // verilen index sinirlarin disinda

        String metin = "Surekli ogrenmek gerekir";
        altString(metin, 4,13); // kli ogren


    }

    public static void altString(String metin, int basIndex, int bitIndex ){

        if (basIndex > bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (basIndex >= metin.length() || bitIndex >= metin.length()) {
            System.out.println("verilen index sinirlarin disinda");
        }else{
            for (int i = basIndex; i < bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }

}
