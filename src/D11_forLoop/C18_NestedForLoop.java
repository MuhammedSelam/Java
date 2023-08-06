package D11_forLoop;

public class C18_NestedForLoop {

    public static void main(String[] args) {

        /*

        1
        1  2
        1  2  3
        1  2  3  4

         */

        for (int i = 1; i <=4 ; i++) { // satirlari

            for (int j = 1; j <= i ; j++) { // sutunlari

                System.out.print(j + "  ");
            }
            System.out.println("");
        }

    }
}
