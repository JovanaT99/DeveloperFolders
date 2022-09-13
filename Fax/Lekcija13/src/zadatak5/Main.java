package zadatak5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Knjiga knjiga = new Knjiga("Na Drini Cuprija",
                "Ivo Andric",
                "Neki sadrzaj",
                1995);

        Knjiga knjiga1 = new Knjiga("Prokleta Avlija",
                "Ivo Andric",
                "Jos jedan sadrzaj",
                1950);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi naslov:");
        String naslov = scanner.nextLine();
        System.out.println("Unesi:");
        String autor = scanner.nextLine();
        System.out.println("Unesi:");
        String sadrzaj = scanner.nextLine();
        System.out.println("Unesi godinu:");
        int godinaIzdanja = scanner.nextInt();


        Knjiga knjiga2 = new Knjiga(naslov, autor, sadrzaj, godinaIzdanja);
        Biblioteka biblioteka = new Biblioteka();
        biblioteka.dodajKnjigu(knjiga);
        biblioteka.dodajKnjigu(knjiga1);
        biblioteka.dodajKnjigu(knjiga2);
        biblioteka.dodajKnjigu(knjiga);

        System.out.println("Prvo ubacivanje u bibilioteku:");
        System.out.println(biblioteka.nadjiKnjigu(knjiga.getNaslov()));
        biblioteka.ukloniKnjigu(knjiga1);
        biblioteka.ukloniKnjigu(knjiga1.getNaslov());
        System.out.println("Nakon uklanjanja");
        System.out.println(biblioteka.nadjiKnjigu(knjiga1.getNaslov()));
        System.out.println(biblioteka.nadjiKnjigu(knjiga2.getNaslov()));

        System.out.println("Unesi naslov knjige");
        String naslovPretraga = scanner.nextLine();
        System.out.println(biblioteka.nadjiKnjigu(naslovPretraga));

    }
}
