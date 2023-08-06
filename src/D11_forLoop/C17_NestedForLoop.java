package D11_forLoop;

import java.util.Scanner;

public class C17_NestedForLoop {

    public static void main(String[] args) {


        /*
            Kullanicidan 2 rakam alin
            ilk rakan satir
            ikinci rakam sutun olmak uzere asagidaki sekli cizdirin

            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen olusturulacak seklin satir sayisini giriniz");
        int satir = scanner.nextInt();

        System.out.println("Lutfen olusturulacak seklin sutun sayisini giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {

                System.out.print("*  ");
            }

            System.out.println("");
        }

    }
}
