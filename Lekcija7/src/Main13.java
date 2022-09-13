import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Unesi:");
        String ime=scanner.nextLine();
        System.out.println("Unesi:");
        String prezime=scanner.nextLine();
        System.out.println("Unesi:");
        int godine=scanner.nextInt();

        Osoba13 osoba13=new Osoba13(ime, prezime, godine);
        System.out.println("Da li je osoba punoletna:" + osoba13.jePunoletna());
    }
}
