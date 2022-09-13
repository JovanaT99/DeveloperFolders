package osoblje;

import java.time.LocalDate;

public class Zaposleni extends Osoba {


    private LocalDate datumPotpisivanjaUgovora;
    private LocalDate datumIstekaUgovora;

    public Zaposleni(String ime, String prezime) {
        super(ime, prezime);
    }


    public LocalDate getDatumPotpisivanjaUgovora() {
        return datumPotpisivanjaUgovora;
    }

    public LocalDate getDatumIstekaUgovora() {
        return datumIstekaUgovora;
    }

   public void potpisiUgovor(LocalDate datumIstekaUgovora) {

        this.datumPotpisivanjaUgovora = LocalDate.now();
        this.datumIstekaUgovora = datumIstekaUgovora;

    }
}
