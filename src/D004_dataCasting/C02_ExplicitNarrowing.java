package D004_dataCasting;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {

        double sayiDouble = 110.5;
        int sayiInt = (int) sayiDouble;
        System.out.println("Sayi Int: " + sayiInt); // 110

        byte sayiByte = (byte) sayiInt;
        System.out.println("Sayi byte: " + sayiByte); // 110

        sayiInt= 132;
        sayiByte = (byte) sayiInt ;
        System.out.println("Sayi byte: " + sayiByte);// -124

        sayiInt = 148;
        sayiByte = (byte)sayiInt;
        System.out.println("Sayi byte: " + sayiByte);// -108

        sayiInt = 279;
        sayiByte = (byte)sayiInt;
        System.out.println("Sayi byte: " + sayiByte);// 23

        sayiInt = 2663;
        sayiByte = (byte)sayiInt;
        System.out.println("Sayi byte: " + sayiByte); // 103

    }
}
