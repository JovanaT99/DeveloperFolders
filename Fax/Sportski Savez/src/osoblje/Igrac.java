package osoblje;

public class Igrac extends Zaposleni {


    String pozicija;

    public Igrac(String ime, String prezime, String pozicija) {
        super(ime, prezime);
        this.pozicija = pozicija;
    }


    public String getPozicija() {
        return pozicija;
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime() + "  " + pozicija;
    }
}
