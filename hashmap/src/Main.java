import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //hashmap verileri key value ciftleri tutar

        HashMap<Integer,String> isimler=new HashMap<Integer, String>();

        // hashmape eleman koyma

        isimler.put(1,"yasin");
        isimler.put(2,"mustafa");
        isimler.put(3,"asya");
        isimler.put(4,"ayse");
        isimler.put(5,"ali");

        //hasmap elemanlarida foreach

        for (Map.Entry<Integer,String> entry :isimler.entrySet()){
            int id = entry.getKey();
            String isim = entry.getValue();
            if (id==5){
                isimler.remove(id);
                System.out.println(id+"'li ogrencinin ismi:"+isim +" silindi");
            }else{
                System.out.println(id+"'li ogrencinin ismi:"+isim);
            }
        }


    }
}