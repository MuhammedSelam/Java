package D12_methodOlusturma_Kullanma;

public class C08_methodOlusturma {

    public static void main(String[] args) {



        double sonuc = hesapMakinesi(2,6,'*');
        System.out.println(sonuc); // 12.0

        System.out.println(hesapMakinesi(4,7,'+')); // 11.0



    }

    public static double hesapMakinesi(int sayi1, int sayi2,char islemSembolu) {


        double sonuc = 0;

        switch (islemSembolu) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                sonuc = (double) sayi1 / sayi2;
                break;
            default:
                System.out.println("islem Sembolu yanlis, sonuc 0 olarak atandi");

        }

        return sonuc;
    }

}
