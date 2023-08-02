package D07_ifStatements;

public class C02_ifStatements {

    public static void main(String[] args) {

        int a = 60;

        if (a % 3 == 0)
            System.out.println("a 3 ile tam bolunuyor 1"); // ilk ; e kadar olan kisim if body'sidir
            System.out.println("a 3 ile tam bolunuyor 2"); // sonraki satirlarin if ile ilgisi yoktur
            System.out.println("a 3 ile tam bolunuyor 3");

    }
}
