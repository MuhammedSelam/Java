package D12_methodOlusturma_Kullanma;

public class C06_methodOlusturma {

    public static void main(String[] args) {

        /*

            proje icerisinde 1 kere olusturulan method'un
            her yerden rahatlikla kullanilabiliriz

            Baska bir class'da static keyword kullanilarak olusturulan method'lara
            classIsmi.methodismi(parametreler) seklinde ulasabiliriz
         */

        C01_MethodOlusturma.altString("Java guzeldir", 2,9); // va guze

        C05_MethodOlusturma.toplama(23,68); // 91
    }
}
