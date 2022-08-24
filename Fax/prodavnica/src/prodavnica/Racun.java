package prodavnica;

import artikli.Artikal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Racun {

    int id;
    LocalDate datum;
    ArrayList<Artikal> artikli = new ArrayList<>();

   public Racun(int id, LocalDate datum) {

        this.id = id;
        this.datum = datum;

    }

    public void dodajArtikal(Artikal artikal, int kolicina) {
        artikal.setKolicina(kolicina);
        artikli.add(artikal);
    }


    @Override
    public String toString() {
        int dan = datum.getDayOfMonth();
        int mesec = datum.getMonthValue();
        int godina = datum.getYear();
        StringBuilder bilderracuna = new StringBuilder();
        bilderracuna.append("Racun br.  " + id + " (" + dan + "." + mesec + "." + godina + ")\n");
        int ukupnaCena = 0;
        for (Artikal artikal : artikli) {
            bilderracuna.append(artikal.getNaziv());
            bilderracuna.append("        ");
            bilderracuna.append(artikal.getKolicina());
            bilderracuna.append("        ");
            bilderracuna.append(artikal.getCenaZaKolicinu());
            bilderracuna.append("\n");
            ukupnaCena += artikal.getCenaZaKolicinu();
        }
        bilderracuna.append("Upupna cena: ").append(ukupnaCena).append(" dinara\n");

        return bilderracuna.toString();

    }

    public int getUkupnaCena() {

        int ukupnaCena = 0;
        for (Artikal artikal : artikli) {
            ukupnaCena += artikal.getCenaZaKolicinu();
        }
        return ukupnaCena;
    }


}
