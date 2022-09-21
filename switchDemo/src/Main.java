import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner chr = new Scanner(System.in);
        System.out.println("harf giriniz: ");
        char grade = chr.next().charAt(0);
        */
        char grade = 'B';


        switch (grade) {
            case 'A':
                System.out.println("Mukkemmel : gectiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("iyi : gectiniz");
                break;
            case 'D':
                System.out.println("Fena degil : gectiniz");
                break;
            case 'F':
                System.out.println("maalesef : kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");
        }
    }
}