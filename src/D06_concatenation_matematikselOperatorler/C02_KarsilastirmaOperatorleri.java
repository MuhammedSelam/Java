package D06_concatenation_matematikselOperatorler;

public class C02_KarsilastirmaOperatorleri {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        b = 2 * a ;

        // esitligi kontrol etmek istersek == kullaniriz
        System.out.println( b == 2*a ); // 20 == 20 ==> true

        System.out.println( 3*b > 5*a ); // 60 > 50 ==> true
        System.out.println( b >= b-a ); // true
        System.out.println( a <= b-a ); // true

        System.out.println(a < b); // true
        System.out.println( ! (a < b) ); // false
        System.out.println(a != b ); // true

    }
}
