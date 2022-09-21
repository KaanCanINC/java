public class Main {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("en buyuk sayi: " + enBuyuk);


        //benim denedigim yontem
/*      int sayi1 = 20;
        int sayi2 = 25;
        int sayi3 = 2;

        if(sayi1 > sayi2){
            System.out.println("sayi1 buyuktur sayi2 ");
        }else if(sayi1 > sayi3){
            System.out.println("sayi1 buyuktur sayi3 ");
        } else if (sayi2 > sayi3) {
            System.out.println("sayi2 buyuktur sayi3 ");
        } else if (sayi2 > sayi1) {
            System.out.println("sayi2 buyuktur sayi1 ");
        } else if (sayi3 > sayi2) {
            System.out.println("sayi2 buyuktur sayi3 ");
        }else if(sayi3 > sayi1){
            System.out.println("sayi2 buyuktur sayi3 ");
        }*/

    }
}