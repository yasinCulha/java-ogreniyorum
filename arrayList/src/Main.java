import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*
        1-Ayni data tipindeki datalari depolamak icin  array'leri kullaniriz
        yeni eleman ekleme acik degildir bu arrayler
        2-Array List bu duruma cozum olarak gelmistir esnek yapisi vardir.
        */

        //normal array olusturma
        int [] sayilar =new int[5];

        //ArrayList olusturma
        ArrayList<Integer> sayilar2= new ArrayList<>();
        List<Integer> yaslar=new ArrayList<>();

        //Array liste eleman ekleme
            //yol-1(listeye sirayla ekliyor elemanlari)
            yaslar.add(55);
            yaslar.add(54);
            //yol-2(istedigimiz indexe ekleyebiliyoruz)
            yaslar.add(2,31);
            //yol-3(arraylist birlestirme)
            ArrayList<Integer> yaslar2=new ArrayList<>();
            yaslar2.add(125);
            yaslar2.add(52);
            yaslar2.add(65);
            yaslar2.add(45);
            //yaslarin sonuna yaslar2'yi ekler
            yaslar.addAll(yaslar2);
           //eklenecegi sirayi da bu sekilde belirtebiliyoruz
            yaslar.addAll(1,yaslar2);

        //array list eleman sayisini bulma
        System.out.println(yaslar.size());

        //array lsitteki konumuna gore elemani bulma
        System.out.println(yaslar.get(3));

        //array listteki elemani degistirme
        System.out.println(yaslar.set(2,555));

        //array listen eleman silme
        System.out.println(yaslar.remove(3));

        //array listte aradigimiz eleman var mi yok mu nasil bulunur
        System.out.println(yaslar.contains(55)? "55 var":"55 yok");

        //array listte bos mu olup olmadigini kontrol etme
        System.out.println(yaslar.isEmpty() ? "bos":"bos degil");

        //Array list ekrana yazdirma
        System.out.println(yaslar);



    }
}