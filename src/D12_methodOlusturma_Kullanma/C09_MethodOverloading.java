package D12_methodOlusturma_Kullanma;

public class C09_MethodOverloading {


    public static void main(String[] args) {

        toplama(5,6.8); // int sayi ile double sayinin toplami : 11.8

        toplama(5.3,6); // double sayi ve int sayinin toplami : 11.3

        toplama(6,8); // iki int sayinin toplami : 14


    }


    public static void toplama(int sayi1 , int sayi2){

        System.out.println("iki int sayinin toplami : " + (sayi1 + sayi2));
    }

    public static void toplama(int a , double b){
        System.out.println("int sayi ile double sayinin toplami : " + (a + b));
    }

    public static void toplama(double b , int a){ // toplama double int
        System.out.println("double sayi ve int sayinin toplami : " +(a+b));
    }

}
