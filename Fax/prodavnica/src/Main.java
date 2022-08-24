import artikli.Artikal;
import artikli.Kozmetika;
import artikli.Povrce;
import artikli.Voce;
import prodavnica.Prodavnica;
import prodavnica.Racun;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Artikal voce = new Voce("Banane", 20, "Smrznuto", "kg");
        System.out.println(voce);
        System.out.println();
        Artikal kozmetika = new Kozmetika("Losion za telo", 400);
        System.out.println(kozmetika);
        System.out.println();
        Artikal povrce = new Povrce("Paradajz", 100, "kg");
        System.out.println(povrce);
        System.out.println();

        Prodavnica prodavnica = new Prodavnica("STR Jovana", "Jevrejska 24");

        Racun racun1 = new Racun(1, LocalDate.now());
        racun1.dodajArtikal(getVoce(), 2);
        racun1.dodajArtikal(getKozmetica(), 1);
        racun1.dodajArtikal(getPovrce(), 3);
        System.out.println(racun1);
        System.out.println();
        prodavnica.dodajRacun(racun1);

        Racun racun2 = new Racun(2, LocalDate.now());
        racun2.dodajArtikal(getVoce(), 1);
        racun2.dodajArtikal(getKozmetica(), 2);
        System.out.println(racun2);
        System.out.println();
        prodavnica.dodajRacun(racun2);


        Racun racun3 = new Racun(3, LocalDate.now());
        racun3.dodajArtikal(getPovrce(), 2);
        System.out.println(racun3);
        System.out.println();
        prodavnica.dodajRacun(racun3);

        System.out.println(prodavnica.getPrviRacunzaDate(22,8,2022));


    }

    public static Artikal getVoce() {
        return new Voce("Banane", 20, "Smrznuto", "kg");
    }

    public static Artikal getKozmetica() {
        return new Kozmetika("Losion za telo", 400);
    }

    public static Artikal getPovrce() {
        return new Povrce("Paradajz", 100, "kg");
    }
}
