

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("kac tane sayiyi kontrol etmek istersiniz: ");
    int elemanSayisi= Integer.parseInt(scanner.nextLine());

    int[] sayilar = new int[elemanSayisi];
    int[] asallar=new int[elemanSayisi];
    int asalSayaci=0;

    for (int i = 0; i < elemanSayisi; i++) {
        System.out.println((i + 1) + ". sayiyi giriniz: ");
        sayilar[i] = Integer.parseInt(scanner.nextLine());
    }

    for(int sayi :sayilar){
        if (sayi < 2) continue;
        boolean asalMi=true;
        for(int j=2;j<=sayi/2;j++){
            if (sayi % j == 0) {
                asalMi=false;
                break;
            }}
        if(asalMi){
            asallar[asalSayaci]=sayi;
            asalSayaci++;
        }
    }

    System.out.print("\nBulunan Asal Sayilar: \n");
    for (int i = 0; i < asalSayaci; i++) {
        System.out.println(asallar[i] + " ");
    }
}