void main() {
    System.out.println("---DONGULER---");
//    System.out.println(1);
//    System.out.println(2);
//    System.out.println(3);
//    System.out.println(4);
//    System.out.println(5);

    //Tekrar sayısı belirli olan durumlarda kullanilir. Başlangıç değeri, koşul ve artış/azalış ile tanimlanir
    for (int i=1; i<=5;i++){
        System.out.println(i);
    }
    // Tekrar sayisi belli olmayan durumlarda kullanilir.kosul kontrol edilir ve kosul true dondugu surece calismaya devam eder.
    int i =1;
    while(i<=5){
        System.out.println(i);
        i++;
    }

    do {
        System.out.println(i);
        i++;
    }while (i<=5);

}