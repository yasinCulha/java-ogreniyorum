public class Main {

    public static void main(String[] args) {
        System.out.println("---- OPERATORLER ----");

        System.out.println("---- Aritmatik Operatorler ----");
        // = Atama Operatorudur
        int sayi1 = 20;
        int sayi2=40;

        // + Toplama Operatorudur
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam :" +toplam);

        // + Operatoru ayni zamanda stringleri birlestirmede de kullaniliyor
        String yazi1 = "Hello";
        String yazi2 = "World";
        System.out.println(yazi1 +" "+yazi2);

        // - Cikarma Operatorudur
        int fark = sayi2 - sayi1;
        System.out.println("fark :" +fark);
        // * Carpim Operatorudur
        int carpim = sayi1*sayi2;
        System.out.println("carpim :" +carpim);
        // / Bolum Operatorudur
        int bolum = sayi2/sayi1;
        System.out.println("bolum :" +bolum);
        //  % Mod alma(bir sayiyi diger sayiyay bolup kalanini bulmaya modalma denir)
        int modAl = sayi2 % sayi1;
        System.out.println("modAl :" +modAl);

        // Arttirma Operatoru
        int arttir = sayi1++;
        System.out.println("arttir :" +sayi1);

        // Azaltma Operatoru
        int azalt = sayi2--;
        System.out.println("azalt :" +sayi2);

        //sayi1 +=5; ->Sayiya 5 eklenmesini saglar
        // sayi1 -=5; ->sayidan 5 cikarilmasini saglar
        //sayi1 *=5; -> sayiyi 5'le carpar
        //sayi1 /=5; -> sayiyi 5'e boler
        //sayi1 %=5; -> sayiyi 5'gore kalanini verir

        System.out.printf("cikti: " +sayi1);

        System.out.println("---- Iliskisel Operatorler ----");

        // boolean sonuc = sayi1 == sayi2; "==" esit mi operatoru
        // boolean sonuc = sayi1 != sayi2 "!=" esit degil  operatoru
        // boolean sonuc = sayi1> sayi2; ">" Buyuktur operatoru
        // boolean sonuc = sayi1< sayi2; "<" Kucuktur operatoru
        // boolean sonuc = sayi1 <= sayi2; "<=" Kucuk Esit operatoru
        // boolean sonuc = sayi1 >= sayi2; ">=" Kucuk Esit operatoru
        System.out.printf("cikti: " +sonuc);
    }
}