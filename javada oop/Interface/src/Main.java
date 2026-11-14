import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Otomobil otomobil1 = new Otomobil();
        Scanner scanner = new Scanner(System.in);

        otomobil1.bakiye = 100;
        otomobil1.plaka = "55 ABC 555";
        otomobil1.aracMarka = "mercedes";
        otomobil1.aracSahibi = "yasin culha";

        int hgsedUcret = otomobil1.hgsUcret(50);

        while (true) {
            System.out.println("\nHangi yolu tercih edeceksiniz?\n1- HGS'li yol\n2- Normal yol\nÇıkış için (-1)");
            int yolSecimi = Integer.parseInt(scanner.nextLine());

            if (yolSecimi == -1) {
                System.out.println("Sistemden çıkış yapılıyor...");
                break;
            }

            switch (yolSecimi) {
                case 1:
                    if (otomobil1.bakiye >= hgsedUcret) {
                        otomobil1.bakiye -= hgsedUcret;
                        System.out.println("HGS geçişi başarılı. Kalan bakiye: " + otomobil1.bakiye);
                    } else {
                        System.out.println("Yetersiz bakiye!");
                    }
                    break;
                case 2:
                    System.out.println("Normal yol tercih edildi, ücret kesilmedi.");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }

            otomobil1.yazdir(otomobil1.plaka, otomobil1.aracSahibi, otomobil1.aracMarka, otomobil1.bakiye);
        }
    }
}