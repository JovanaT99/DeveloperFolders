import java.time.LocalDate;

import java.time.LocalDate;

public class Profesor extends Nastavnik {

    private String titula;
    private LocalDate localDate;


    public Profesor(String ime, String prezime, int radnoVreme, int radnoVremeDo) {
        super(ime, prezime, radnoVreme, radnoVremeDo);
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }


    @Override
    public String toString() {
        return super.toString() + "zaposlen od:" + localDate;
    }

}