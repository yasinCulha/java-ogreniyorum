import java.util.Scanner;

void main() {

    double bakiye = 5555.0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Hangi islemi yapmak istersiniz: " +
            "\n1-Bakiye Goruntuleme" +
            "\n2-Para Cekme" +
            "\n3-Para Yatirma" +
            "\n4-Cikis");

    int secenek = scanner.nextInt();

    switch (secenek) {
        case 1:
            System.out.println("Mevcut Bakiyeniz: " + bakiye + " TL");
            break;

        case 2:
            System.out.print("Cekmek istediginiz miktari giriniz: ");
            double cekilecekMiktar = scanner.nextDouble();

            if (cekilecekMiktar <= 0) {
                System.out.println("Gecersiz miktar girdiniz.");
            } else if (bakiye >= cekilecekMiktar) {
                bakiye -= cekilecekMiktar;
                System.out.println("Para cekildi. Guncel Bakiyeniz: " + bakiye + " TL");
            } else {
                System.out.println("Yetersiz Bakiye! Bakiyeniz: " + bakiye + " TL");
            }
            break;

        case 3:
            System.out.print("Yatirmak istediginiz miktari giriniz: ");
            double yatirilacakMiktar = scanner.nextDouble();

            if (yatirilacakMiktar <= 0) {
                System.out.println("Gecersiz miktar girdiniz.");
            } else {
                bakiye += yatirilacakMiktar;
                System.out.println("Para yatirildi. Guncel Bakiyeniz: " + bakiye + " TL");
            }
            break;

        case 4:
            System.out.println("Cikis yapiliyor...");
            break;
    }

    scanner.close();
}