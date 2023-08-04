package D010_StringManipulations;

public class C06_indexOf {

    public static void main(String[] args) {

        String str = "Ali topu at, topu at ali";

        // at kelimesinin 2 kere kullanilip kullanilmadigini metne bakmadan bulun

        int ilkIndex= str.indexOf("at");

        if (ilkIndex == -1){ // hic kullanilmamis
            System.out.println("2 kere kullanilmamis");
        }else { // en az 1 kere kullanilmis

            int ikinciIndex = str.indexOf("at", ilkIndex + 1);

            if (ikinciIndex == -1) { // sadece 1 kere kullanilmis, 2.kullanim yok
                System.out.println("2 kere kullanilmamis");
            } else {
                System.out.println("2 defa veya daha fazla kullanilmis");
            }
        }

    }
}
