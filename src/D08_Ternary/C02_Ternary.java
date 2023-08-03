package D08_Ternary;

public class C02_Ternary {

    public static void main(String[] args) {

        // input olarak verilen bir sayinin 3 ile tam bolunup bolunmedigini bulun

        int input = 20;

        String sonuc = input % 3 == 0 ? "3 ile tam bolunuyor" : "3 ile tam bolunmuyor" ;

        System.out.println(sonuc);

    }
}
