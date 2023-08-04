package D10_StringManipulations;

import java.util.Locale;

public class C01_StringManipulations {

    public static void main(String[] args) {

        String str = "Java Guzeldir";
        String str1 = "Ali";
        String str2 = "ali";
        String str3 = " ";

        // 1. toUpperCase()
        System.out.println(str.toUpperCase()); // JAVA GUZELDİR
        str = str.toUpperCase(); // JAVA CANDIR

        // 2. toLowerCase()
        System.out.println(str.toLowerCase()); // java guzeldir

        // eger bu degisimi ingilizce disinda bir dili esas almak isterseniz Locale secenegi kullanilir
        System.out.println(str.toLowerCase(Locale.GERMAN)); // java candir
        // eger yerel bir dile gore buyuk kucuk harf degisimi yapmak istersek
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

        // 3. equals()
        System.out.println(str1.equals(str2)); // false
        // iki String'in metinlerini karsilastirir, birbiriyle ayni ise true, yoksa false ...

        // 4. equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        // 5. charAt()
        System.out.println(str.charAt(2)); // v  (2.indexindeki karakter)

        // 6. length()
        System.out.println(str.length()); // 13  (uzunulugu)
        System.out.println(str.length()-1); // 12 (13-1)

        // 7. substring()
        System.out.println(str.substring(10)); // dir
        System.out.println(str.substring(9,12)); // ldi
        // baslangig index dahil, bitis index haric

        // 8. concat()
        System.out.println(str.concat(str3).concat(str1)); // Java Guzeldir Ali
        // String'in sonuna baska bir String ekler

        // 9. contains()
        System.out.println(str.contains("Ja")); // true
        System.out.println(str.contains("ja")); // false
        // baska bir Strng'i icerip icermedigini kontrol eder

        // 10. startsWith()
        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java Guzel")); // true
        System.out.println(str.startsWith("uz", 3)); // false
        // baskabir String ile baslayip baslamadigini kontrol eder
        // 3.index ve sonrasi "uz" ile mi basliyor diye kontrol eder

        // 11. endsWith()
        System.out.println(str.endsWith("dir")); // true
        System.out.println(str.endsWith("")); // true

        // 12. indexOf()
        System.out.println(str.indexOf("ava")); // 1
        System.out.println(str.startsWith("a",1 )); // true
        System.out.println(str.indexOf("k")); // -1  (bu String icinde yok)

        // 13. lastIndexOf()
        System.out.println(str.lastIndexOf("a")); // 3 (en son kullainiminin index'i)
        System.out.println(str.lastIndexOf('a',1)); // 1
        System.out.println(str.lastIndexOf("m")); // -1  (String icinde yok)
        // son index olarak 1. index'den baslar ve basa doru devam eder

        // 14. isEmpty()
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false
        // isEmpty() : hiclik , isBlank() : hiclik / bosluk
        // String'in bos olup olmadigini kontrol eder

        // null
        String isim1 = null, isim2, isim3 = "";
        System.out.println(isim1); // null
        System.out.println(isim3.length()); // 0
        // null deger degil isaretcidir.

        // 15. replace()
        System.out.println(str.replace("J", "T")); // Tava Guzeldir
        System.out.println(str.replace("Java", "Ogrenmek")); // Ogrenmek Guzeldir
        System.out.println(str.replace("a", "")); // Jv Guzeldir

        // 16. replaceFirst()
        System.out.println(str.replaceFirst("a","")); // Jva Guzeldir
        // ilkini degistirir

        // 17. replaceAll
        System.out.println(str.replaceAll("\\s", "")); // JavaGuzeldir
        //  \\s : space	(bosluk) 	    \\S : space olmayan hersey
        //  \\s+ : yanyana birden fazla space
        // \\d : digits (rakamlar)		\\D : digit olmayan hersey
        //  \\w : harf veya rakam	     \\W : harf veya rakam olmayan hersey

        // 18. repeat()
        System.out.println(str.repeat(2)); // Java GuzeldirJava Guzeldir
        // tekrar sayisi kadar tekrar ettirir

        // 19. trim()
        str = "  Java Guzeldir  ";
        System.out.println(str.trim()); // Java Guzeldir
        // basinda ve sonunda bolunan spaceleri (bosluklari) siler

    }
}
