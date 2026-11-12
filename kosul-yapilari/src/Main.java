void main() {
    System.out.println("--- KOSUL YAPILARI ---");
    System.out.println("--- if_elseif_else ---");
    int not = 80;
    // if' de ki kosul gerceklesiyorsa {} icinde ki kod blogu calistirir.
    //elseif' birden fazla kosul varsa kullanilir
    // else' hic bir kosul gerceklesmiyorsa calisir.

    if (not>90){
        System.out.println("Dersi AA ile gectiniz");
    } else if (not>70 && not<90) {
        System.out.println("Dersi BB ile gectiniz");
    } else {
        System.out.println("Dersten Kaldiniz");
    }

    System.out.println("--- switch_case ---");

    System.out.println("haftanin kacinci gunundeyiz (1-7)");
    Scanner scanner = new Scanner(System.in);

    int gun = scanner.nextInt();

    switch (gun){
        case 1 :
            System.out.println("Pazartesi");
            break; // break: bu kosul saglandiginda diger kosullara bakmasini engller.
        case 2 :
            System.out.println("sali");
            break;
        case 3 :
            System.out.println("carsamba");
            break;
        case 4 :
            System.out.println("persembe");
            break;
        case 5 :
            System.out.println("cuma");
            break;
        case 6 :
            System.out.println("cumartesi");
            break;
        case 7 :
            System.out.println("pazar");
            break;
    }

}