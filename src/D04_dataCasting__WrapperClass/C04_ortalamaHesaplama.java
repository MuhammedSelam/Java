package D04_dataCasting__WrapperClass;

public class C04_ortalamaHesaplama {

    public static void main(String[] args) {

        // Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        int sayi1 = 55;
        int sayi2 = 60;
        int sayi3 = 85;

        // int sayilar toplamini alip sonra double'a cevirecegiz
        int toplam = sayi1 + sayi2 + sayi3;
        double ortalama = (double) toplam / 3;

        System.out.println("Ortalama: " + ortalama);
        // Ortalama: 66.66666666666667

    }

}
