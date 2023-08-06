package D11_forLoop;

import java.util.Scanner;

public class C21_NestedForLoop {

    public static void main(String[] args) {

        // ucgen icin satir ve sutun numaralarini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ucgenin satir sayisini giriniz");
        int satir = scanner.nextInt();

        System.out.println("Lutfen ucgenin sutun sayisini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satir

            for (int j = 1; j <=i ; j++) { // sutun
                System.out.print(i + ","+j + "    ");
            }
            System.out.println("");
        }

    }

}
