package osoblje;

public class Trener extends Zaposleni {

    String zaduzenje;

    public Trener(String ime, String prezime, String zaduzenje) {
        super(ime, prezime);
        this.zaduzenje = zaduzenje;
    }

    public String getZaduzenje() {
        return zaduzenje;
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime() + " " + zaduzenje;
    }
}
