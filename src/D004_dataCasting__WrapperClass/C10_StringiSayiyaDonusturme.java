package D004_dataCasting__WrapperClass;

public class C10_StringiSayiyaDonusturme {

    public static void main(String[] args) {

        // Icinde sadece sayisal ifadeler bulunan bir String verildiginde Matematiksel islem yapmaniz gerekirse
        // Integer.parseInt() ile int'a cevirebiliriz

        String str1 = "42";
        String str2 = "53";

        // Bu degerleri toplayip yazdirin

        System.out.println(str1 + str2); // 4253

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 95


    }
}
