package osoblje;

public class Menadzer extends Zaposleni {

    public Menadzer(String ime, String prezime) {
        super(ime, prezime);
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
}
