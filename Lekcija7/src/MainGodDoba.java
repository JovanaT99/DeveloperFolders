import java.util.Scanner;

public class MainGodDoba {

    public static void main(String[] args) {


        System.out.println("Unesite redni broj meseca:");
        Scanner scanner = new Scanner(System.in);
        int brojMeseca = scanner.nextInt();
        if (brojMeseca >= 3 && brojMeseca <= 6) {

            System.out.println("Prolece");
        } else if (brojMeseca >= 7 && brojMeseca <= 9) {
            System.out.println("leto");
        } else if (brojMeseca >= 10 && brojMeseca <= 12) {
            System.out.println("jesen");
        } else {
            System.out.println("zima");
        }

        System.out.println("Unesite godinu");
        int godina = scanner.nextInt();
        if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
            System.out.println("Prestupna");
        } else {

            System.out.println("Nije prestupna");
        }
    }
}
