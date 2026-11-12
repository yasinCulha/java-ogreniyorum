import hayvan.Kedi;
import hayvan.Kopek;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        long randomSayi=random.nextLong();

        Kopek kopek = new Kopek();

        System.out.println(kopek.id=randomSayi*55);
        System.out.println(kopek.isim="karabas");
        kopek.ayakAdeti(4);
        System.out.println(kopek.yas=2);
        kopek.yasiyorMu(true);

        System.out.println("------------------------------");

        Kedi kedi =new Kedi();

        System.out.println( kedi.id=randomSayi*55);
        System.out.println(kedi.isim="Garfield");
        kedi.ayakAdeti(4);
        System.out.println(kedi.yas=15);
        kedi.yasiyorMu(false);



    }
}