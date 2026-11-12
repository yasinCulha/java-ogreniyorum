import kapsulleme_paketi.Calisan;
public class Main {
    public static void main(String[] args) {
        Calisan calisan1 = new Calisan();

        System.out.println(calisan1.getIsim());
        calisan1.setIsim("yasin");
        System.out.println(calisan1.getIsim());

        System.out.println("-----Calisan Maasi-----");
        System.out.println(calisan1.getMaas());
        calisan1.setMaas(10000);
        System.out.println(calisan1.getMaas());
    }
}