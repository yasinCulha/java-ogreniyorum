import java.util.Scanner;

void main() {
    System.out.println("---DIZILER---");
    //dizi olusturma
   String[] isimler = {"yasin","mustafa","kemal","ayse","fatma"};

   for (int i=0;i<isimler.length;i++){
       System.out.println(isimler[i]);
   }

    // diziye eleman ekleme
    System.out.println("Dizi Kac Elemanli Olsun: ");
    Scanner scanner =new Scanner(System.in);
    int elemanSayisi = Integer.parseInt(scanner.nextLine());
    String[] isimler2 =new String[elemanSayisi];

    for (int i = 0;i<isimler2.length;i++){
        System.out.println(i+1 +". Ismi Giriniz: ");
        isimler2[i]=scanner.nextLine();
    }
    System.out.println("Dizinizdeki isimler");
    for (int i = 0 ; i<isimler2.length;i++){
        System.out.println(isimler2[i]);
    }

    //for-each dongusu

    int[] rakamlar = {0,1,2,3,4,5,6,7,8,9};

    for (int rakam:rakamlar){
        System.out.println(rakam);
    }
}