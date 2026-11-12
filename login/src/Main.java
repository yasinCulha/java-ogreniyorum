//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Giris Yapiniz");

    System.out.println("username adresinizi Giriniz: ");
    String username=scanner.nextLine();
    System.out.println("Sifrenizi Giriniz: ");
    String sifre=scanner.nextLine();

    String girisYapildiMi =login(username,sifre);
    System.out.println(girisYapildiMi);
}

public static String login(String username ,String sifre){
    String myUsername = "Uchiha";
    String mypassword = "Uchiha1234";
    if (username.equalsIgnoreCase(myUsername) && sifre.equals(mypassword)){
        return "Giris Basarili";
    }else{
        return "Gecersiz Bilgi";
    }
}
