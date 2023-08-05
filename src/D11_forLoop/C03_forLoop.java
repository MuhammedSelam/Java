package D11_forLoop;

public class C03_forLoop {

    public static void main(String[] args) {

        // 100'den baslayip 1'e kadar geri geri gidin
        // 7'nin kati olan sayilari yazdirin

        for (int i = 100; i >= 1 ; i--) {
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
