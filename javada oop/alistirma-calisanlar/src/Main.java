import java.util.Scanner;
import calisanlar.Calisan;
public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.menu(); // Metot çağrısı

    }

    public  void menu() {
        Scanner scanner = new Scanner(System.in);
        Calisan calisan1 = new Calisan(1,"yasin","culha",3,100);

        String islemText = "1-Calisan Bilgilerini Goster\n2-Zam yap\n3-Cikis";

        System.out.println("-----UYGULAMAYA HOSGELDINIZ-----");

        while (true) {
            System.out.println(islemText);
            System.out.print("Islem seciniz: ");
            int islem = Integer.parseInt(scanner.nextLine());

            if (islem == 3) {
                System.out.println("Programdan cikiliyor...");
                break; // Döngüyü sonlandırır
            } else if (islem == 1) {
                System.out.println("Calisan bilgileri gosteriliyor...");
                calisan1.calisanBilgileriniGoster();
            } else if (islem == 2) {
                System.out.println("Zam yapma islemi...");
                System.out.println("Zam miktarini giriniz: ");
                double maasArtisi=Double.parseDouble(scanner.nextLine());
                double guncelMaas=calisan1.zam(maasArtisi);
                System.out.println("Guncel Maasiniz:" + guncelMaas);

            } else {
                System.out.println("Gecersiz islem!");
            }

            System.out.println("--------------------------------");
        }

        scanner.close();
    }
}