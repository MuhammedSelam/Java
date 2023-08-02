package D06_concatenation_matematikselOperatorler;

public class C01_Concatenation {

    public static void main(String[] args) {

        String s1 = "Ogrenmek";
        String s2 = "Guzeldir";
        String s3 = " ";
        String s4 = "";
        int a = 6;
        int b = 8;

        System.out.println(s1+a+b); // Ogrenmek68

        System.out.println(s1+ a*b ); // Ogrenmek48

        System.out.println(a+b+s2); // 14Guzeldir

        System.out.println( b+ (a+s1)  ); // 86Ogrenmek

        System.out.println( s4 + b + a + s1); // 86Ogrenmek

        System.out.println( b + s4 + a + s1); // 86Ogrenmek

        System.out.println(s4 + a + b + s3 + s1); // 68 Ogrenmek

    }
}
