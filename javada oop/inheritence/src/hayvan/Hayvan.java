package hayvan;

public class Hayvan {
    public long id;
    public String isim;
    public int yas;
    //protected alan belirleyici sadece o classta ve o classi miras alan subclassta gecerlidir.
    protected int ayakSayisi;

    public void yasiyorMu(boolean yasiyor)
    {
        if(yasiyor){
            System.out.println("yasiyor" );
        }else{
            System.out.println("oldu");
        }
    }
}
