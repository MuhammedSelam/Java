package D11_forLoop;

import java.util.Scanner;

public class C20_NestedForLoop {

    public static void main(String[] args) {

        // dikdortgen bicimde, satir ve sutun numaralarini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olusturulacak seklin satir sayisini giriniz");
        int satir = scanner.nextInt();

        System.out.println("Lutfen olusturulacak seklin sutun sayisini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satir

            for (int j = 1; j <=sutun ; j++) { // sutun

                System.out.print(i + ","+j + "    ");
            }
            System.out.println("");
        }



    }
}
