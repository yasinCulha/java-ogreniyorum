package kapsulleme_paketi;

public class Calisan {
    private int no;
    private String isim;
    private  String soyisim;
    private int maas;

    // private tanimli methodlara 2 sekil erisilir
    //1-consructor method ile erisim

    public Calisan(){};

    public Calisan( int no, String isim, String soyisim, int maas) {
        this.no = no;
        this.isim = isim;
        this.soyisim = soyisim;
        this.maas = maas;
    }
    //2 getter ve setter ->kapsulleme

    // isim degerini getirir
    public String getIsim(){
        return isim;
    }

    //isim degerini degistiririr
    public void setIsim(String isim){
        this.isim= isim;
    }

    public int getMaas(){
        return maas;
    }
    public void setMaas(int maasMiktari){
        if(maasMiktari>0){
            this.maas=maasMiktari;
        }
    }
}
