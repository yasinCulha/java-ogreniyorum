package com.yasinculha;

public class Ogrenci {
    public int id;
    public String isim;
    public String soyisim;

    //constructor(yapici method)
    public Ogrenci(int id ,String isim ,String soyisim){
        // this: suan islem yaptigin classi ifade eder.
        this.id=id;
        this.isim=isim;
        this.soyisim=soyisim;
    }
}
