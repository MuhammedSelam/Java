package D11_forLoop;

public class C04_forLoop {

    public static void main(String[] args) {

        // kullanicinin verdigi baslangic ve bitis degerleri dahil olarak
        // bu sayilarin arasinda aranan sayiya tam bolunebilen bir sayi varsa
        // "aranan sayi ile tam bolunebilen bir sayi var" yazdirin

        int baslangic = 125;
        int bitis = 250;

        int arananSayi = 43;

        for (int i = baslangic; i <= bitis; i++) {
            System.out.println(i);
            if (i % arananSayi == 0) {
                System.out.println("aranan sayi ile tam bolunebilen bir sayi var");
                break;
            }
        }

        /*
            bir loop devam ederken
            eger bir degerde istedigimiz islem gerceklesir
            ve loop'un geri kalanina ihtiyacimiz olmazsa
            orada break kullanabiliriz
            Java break; komutunu gordugunde loop'u calistirmayi birakir
         */

    }
}
