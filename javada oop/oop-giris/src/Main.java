import com.yasinculha.Ogrenci;

public class Main {
    public static void main(String[] args) {
        System.out.printf("---Java'da OOP---");
        // Bir class var ve o classin icindeki degiskenlere erisebilmek icin bir nesne turetmek lazim
        // new: nesne turetmeye yarar

        Ogrenci ogrenci1 = new Ogrenci(55,"yasin","culha");

//        ogrenci1.id=55;
//        ogrenci1.isim="yasin";
//        ogrenci1.soyisim="culha";

        System.out.println("OGRENCI BILGILERI");
        System.out.println("ogrenci idsi: " +ogrenci1.id);
        System.out.println("ogrenci ismi: " +ogrenci1.isim);
        System.out.println("ogrenci soyismi: " +ogrenci1.soyisim);
    }
}