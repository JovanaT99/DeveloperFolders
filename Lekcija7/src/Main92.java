import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main92 {


    public static void main(String[] args) {
        Osoba92 osoba92 = new Osoba92("Joki", "Blagojevic", 23, 158, 50);
        System.out.println(osoba92);
        System.out.println(osoba92.getGodine());
        System.out.println(osoba92.indexTelesneMase());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi:");
        String ime = scanner.nextLine();
        System.out.println("Unesi:");
        String prezime = scanner.nextLine();
        System.out.println("Unesi");
        int godine = scanner.nextInt();
        System.out.println("Unesi");
        int visina = scanner.nextInt();
        System.out.println("Unesi");
        int telesnaMasa = scanner.nextInt();

        while (godine < 20) {
            System.out.println("Godine moraju biti bar 20");
            ime = scanner.nextLine();
            System.out.println("Unesi:");
            prezime = scanner.nextLine();
            System.out.println("Unesi");
            godine = scanner.nextInt();
            System.out.println("Unesi");
            visina = scanner.nextInt();
            System.out.println("Unesi");
            telesnaMasa = scanner.nextInt();
        }
        Osoba92 osoba921 = new Osoba92(ime, prezime, godine, visina, telesnaMasa);
        System.out.println(osoba92.indexTelesneMase());

        ArrayList<Osoba92> indexMase = new ArrayList<>();
        Osoba92 osoba922 = new Osoba92("Pera", "Peric", 34, 174, 60);
        Osoba92 osoba923 = new Osoba92("Milos", "Milic", 43, 180, 85);
        Osoba92 osoba924 = new Osoba92("Mika", "Mikic", 27, 165, 55);
        Osoba92 osoba925 = new Osoba92("Maja", "Markovic", 20, 170, 100);

        if (osoba922.indexTelesneMase() > 18.5 && osoba922.indexTelesneMase() <= 25) {

            indexMase.add(osoba922);
        }
        if (osoba923.indexTelesneMase() > 18.5 && osoba923.indexTelesneMase() <= 25) {

            indexMase.add(osoba923);
        }

        for (Osoba92 osoba926 : indexMase) {

            System.out.println(osoba92);
        }
    }
}
