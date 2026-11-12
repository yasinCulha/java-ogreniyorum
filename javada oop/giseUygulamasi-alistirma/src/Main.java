import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---TC KIMLIK KONTROL UYGULAMASINA HOSAGELDINIZ---");
        System.out.println("TC kimlik numaranizi giriniz");
        String tc=scanner.nextLine();

        TCKNN kisi=new TCKNN();
        kisi.setTc(tc);






    }
}