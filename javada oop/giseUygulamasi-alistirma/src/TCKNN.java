import java.util.Random;

public class TCKNN {
    int id;
    String ad;
    String soyad;
    String tc;

    public int getId(){return id;};
    public void setSoyad(int id){this.id=id;};

    public String getAd(){return ad;};
    public void setAd(String ad){this.ad=ad;};

    public String getSoyad(){return soyad;};
    public void setSoyad(String soyad){this.soyad=soyad;};

    boolean kontrol=false;
    public String getTc(){return tc;};
    public void setTc(String tc){
        if (tc.length()==11)
        {
            for (int i=0 ; i<tc.length();i++){
                char karakter = tc.charAt(i);
                if(Character.isDigit(karakter)){
                    kontrol=true;
                }
                else{
                    kontrol=false;
                    break;
                }
            }
            if(kontrol){
                Random random =new Random();
                int giseNo= random.nextInt(100);
                sonucYazdir("Gise numarasi:"+giseNo);
            }else{
                sonucYazdir("TC butun karakterleri rakam olmalidir");
            }
        }
        else{sonucYazdir("TC 11 haneli olmali ");}
    };
    public void sonucYazdir(String text){
        System.out.println(text);
    }


}
