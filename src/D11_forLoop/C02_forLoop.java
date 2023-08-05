package D11_forLoop;

public class C02_forLoop {

    public static void main(String[] args) {

        // kullanicinin verdigi sayidan baslayin
        // 100'e kadar(100 dahil) 5'er 5'er artirarak yazdirin

        int input = 20;

        for (int i = input; i <= 100; i += 5) {
            System.out.print(i + " ");
        }

    }
}
