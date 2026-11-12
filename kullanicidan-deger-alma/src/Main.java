import java.util.Scanner;


void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Adinizi ve soyadinizi giriniz");
    String ad_soyad = scanner.nextLine();

    System.out.println("yasinizi giriniz");
    int yas = scanner.nextInt();

    System.out.println("Boyunuzu giriniz m cinsinden");
    float boy = scanner.nextFloat();

    System.out.println("kilonzu giriniz");
    double kilo = scanner.nextDouble();

    System.out.println(ad_soyad +yas+"'da ve " + boy +" boyunda ve "+ kilo + " kilo");
}