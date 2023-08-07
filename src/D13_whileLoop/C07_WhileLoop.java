package D13_whileLoop;

public class C07_WhileLoop {

    public static void main(String[] args) {

        // While loop kullanarak verilen bir String’i terse cevirip,
        // bu halini bize donduren bir method olusturun.


        System.out.println(metniTerseCevir("Ogrenmek guzeldir"));
        // ridlezug kemnergO


    }
    public static String metniTerseCevir(String metin){

        String tersMetin  = "";

        int index = metin.length()-1;

        while(index >= 0){

            tersMetin += metin.charAt(index);
            index--;

        }

        return tersMetin;
    }
}
