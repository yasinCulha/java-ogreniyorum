package calisanlar;

public class Calisan {
    int no;
    String isim;
    String soyIsim;
    int tecrubeYili;
    double maas;

    public Calisan(){}

    public Calisan(int no,String isim,String soyIsim,int tecrubeYili,double maas){
        this.no=no;
        this.isim=isim;
        this.soyIsim=soyIsim;
        this.tecrubeYili=tecrubeYili;
        this.maas=maas;
    }

    public void calisanBilgileriniGoster(){
        System.out.println("----CALISAN BILGILERI----");
        System.out.println("no: "+no);
        System.out.println("isim: "+isim);
        System.out.println("soyIsim: "+soyIsim);
        System.out.println("tecrube yili: "+tecrubeYili);
        System.out.println("maas: "+maas);

    }
    public void zamYap(double zamMiktari){
        System.out.println("Masiniza "+zamMiktari+" zam yapildi");
        System.out.println("Guncel Maasiniz: "+ (zamMiktari+maas));
    }
    public double zam(double maasArtisi){
        return maas+=maasArtisi;
    }
}
