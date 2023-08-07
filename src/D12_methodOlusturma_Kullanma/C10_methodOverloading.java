package D12_methodOlusturma_Kullanma;

public class C10_methodOverloading {

    public static void main(String[] args) {


        toplama(5,9); // iki int sayinin toplami: 14

        toplama(2.3,3.3); // double sayi ile double sayinin toplami: 5.6

        toplama(6.8,8); // double sayi ve int sayinin toplami: 14.8

        toplama(3,5,9); // 3 int sayinin toplami: 17

        toplama(3.2,5.3,6.4); // 3 double sayinin toplami: 14.9

        toplama(2.3,5,3.7); // 3 double sayinin toplami: 11.0


        }
        public static void toplama ( int sayi1, int sayi2){

            System.out.println("iki int sayinin toplami: " + (sayi1 + sayi2));
        }

        public static void toplama ( double sayi1, double sayi2){
            System.out.println("double sayi ile double sayinin toplami: " + (sayi1 + sayi2));
        }

        public static void toplama ( double b, int a){ // toplama double int
            System.out.println("double sayi ve int sayinin toplami: " + (a + b));
        }

        public static void toplama ( int a, int b, int c){
            System.out.println("3 int sayinin toplami: " + (a + b + c));
        }

        public static void toplama ( double a, double b, double c){
            System.out.println("3 double sayinin toplami: " + (a + b + c));
        }

}
