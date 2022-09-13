package savez;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SportskoDrustvo {


    String naziv;
    String adresa;
    List<Tim> timovi = new ArrayList<>();

    public SportskoDrustvo(String naziv, String adresa) {
        this.naziv = naziv;
        this.adresa = adresa;
    }

    public Tim dodajTim(String naziv, LocalDate datumOsnivanja ) {
        Tim tim = new Tim(naziv, datumOsnivanja);
        timovi.add(tim);
        return tim;
    }

    public int vratiUkupanBrojIgraca() {
        int sumIgraca = 0;
        for (Tim tim : timovi) {

            sumIgraca += tim.getIgraci().size();
        }
        return sumIgraca;
    }

    public int vratiUkupanBrojTrenera() {
        int sumTreneri = 0;
        for (Tim tim : timovi) {

            sumTreneri += tim.getTreneri().size();
        }
        return sumTreneri;
    }

    public int vratiUkupanBrojMenadzeri() {

        return timovi.size();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(detaljiSDrustva())
                .append("________________________________________________________________________________\n")
                .append("Broj igraca: ").append(vratiUkupanBrojIgraca()).append("\n")
                .append("Broj trenera: ").append(vratiUkupanBrojTrenera()).append("\n")
                .append("Broj menadzera: ").append(vratiUkupanBrojMenadzeri()).append("\n")
                .append("________________________________________________________________________________\n")
                .append(timovi());

        return stringBuilder.toString();
    }

    public String timovi() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Tim tim : timovi) {

            stringBuilder.append(tim.toString()).append("\n")
                    .append("________________________________________________________________________________\n");

        }

        return stringBuilder.toString();
    }

    private String detaljiSDrustva() {
        return new StringBuilder().append("Sportsko drustvo: ")
                .append(naziv)
                .append(", ")
                .append(adresa)
                .append("\n")
                .toString();
    }


}
