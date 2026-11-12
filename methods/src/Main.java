void main() {
    System.out.println("---METHODS---");

    // parametresiz ve geriye deger dondurmeyen method tipi
    isimYazdir();

    // parametreli geriye deger dondurmeyen method tipi
    notOrtalamasi(55,55,55);

    //parametreli ve geriye deger donduren method tipi
    int toplamMaas=maasHesapla(15,1500);
    System.out.print("Bu ay ki  maasiniz: "+toplamMaas);
}
public static void isimYazdir(){
    System.out.println("Yasin Culha");
}

public static void notOrtalamasi(int not1,int not2,int not3){

    int sonuc = (not1+not2+not3)/3;
    System.out.println("Not ortalamaniz: " + sonuc);
}
//method hangi degeri dondurcekse deger tipi onunla ayni tipte olmali bizim methodumuz int deger dondurdugu icin deger tipimizde int
public static int maasHesapla(int calisilanGun,int gunUcreti){
    return calisilanGun*gunUcreti;
}