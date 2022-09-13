import java.util.Scanner;

public class Main1306 {
    public static void main(String[] args) {


        Knjiga1306 knjiga1306 = new Knjiga1306("Na Drini Cuprija",
                "Ivo Andric",
                "Neki text",
                1945);

        Knjiga1306 knjiga13061 = new Knjiga1306("Prokleta avlija",
                "Ivo Andric",
                "Text",
                1950
        );

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi:");
        String naslov = scanner.nextLine();
        System.out.println("Unesi:");
        String autor = scanner.nextLine();
        System.out.println("Unesi:");
        String sadrzaj = scanner.nextLine();
        System.out.println("Unesi:");
        int godinaIzdanja = scanner.nextInt();
        Knjiga1306 knjiga13062 = new Knjiga1306(naslov, autor, sadrzaj, godinaIzdanja);
        //System.out.println(knjiga13062);

        Biblioteka biblioteka = new Biblioteka();
        biblioteka.dodajKnjige(knjiga1306);
        biblioteka.dodajKnjige(knjiga13061);
        biblioteka.dodajKnjige(knjiga13062);

        biblioteka.dodajKnjige(knjiga1306);

        System.out.println("Nakon prvog ubacivanja u biblioteku:");
        System.out.println(biblioteka.pronalazak(knjiga1306.getNaslov()));
        biblioteka.ukloniKnjgu(knjiga1306);
        biblioteka.ukloniKnjgu(knjiga13061.getNaslov());
        System.out.println("Nakon uklanjanja prve i druge");
        System.out.println(biblioteka.pronalazak(knjiga1306.getNaslov()));
        System.out.println(biblioteka.pronalazak(knjiga13061.getNaslov()));

        System.out.println("Unesi naslov knjige:");

        String naslovPretraga = scanner.nextLine();
        System.out.println(biblioteka.pronalazak(naslovPretraga));


    }
}
