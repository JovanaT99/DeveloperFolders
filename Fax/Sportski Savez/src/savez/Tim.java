package savez;

import osoblje.*;

import java.time.LocalDate;
import java.util.*;

public class Tim {

    String naziv;
    Menadzer menadzer;
    LocalDate datumOsnivanja;

    List<Igrac> igraci = new ArrayList<>();
    List<Trener> treneri = new ArrayList<>();

    public Tim(String naziv, LocalDate datumOsnivanja) {
        this.naziv = naziv;
        this.datumOsnivanja = datumOsnivanja;
    }

    public Menadzer getMenadzer() {
        return menadzer;
    }

    public List<Igrac> getIgraci() {
        return igraci;
    }

    public List<Trener> getTreneri() {
        return treneri;
    }

    public void dodajMenadzera(Menadzer menadzer) {
        this.menadzer = menadzer;
        this.menadzer.potpisiUgovor(LocalDate.of(2025, 9, 12));

    }

    public void dodajTrenera(Trener trener){
        treneri.add(trener);
    }

    public void dodajIgraca(Igrac igrac) {
        igraci.add(igrac);
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(detaljiTima());
        stringBuilder.append("- ").append(menadzer.toString()).append("\n");
        stringBuilder.append(listaIgraca());
        stringBuilder.append(listaTrenera());
        return stringBuilder.toString();

    }

    private String listaIgraca() {

        StringBuilder stringBuilder = new StringBuilder();
        Comparator<Igrac> abcNiz = Comparator.comparing(Igrac::getPozicija);
        igraci.sort(abcNiz);
        for (Igrac igrac : igraci) {

            stringBuilder.append("  - ").append(igrac.toString()).append("\n");

        }
        return stringBuilder.toString();
    }

    private String listaTrenera() {

        StringBuilder stringBuilder = new StringBuilder();
        Comparator<Trener> abcNiz = Comparator.comparing(Trener::getZaduzenje);
        treneri.sort(abcNiz);
        for (Trener trener : treneri) {
            stringBuilder.append("  - ").append(trener.toString()).append("\n");

        }
        return stringBuilder.toString();
    }

    private String detaljiTima() {
        return new StringBuilder().append("Tim - ")
                .append(naziv)
                .append(" ")
                .append(datumOsnivanja.getDayOfMonth())
                .append(".")
                .append(datumOsnivanja.getMonthValue())
                .append(".")
                .append(datumOsnivanja.getYear())
                .append("\n")
                .toString();
    }

}


