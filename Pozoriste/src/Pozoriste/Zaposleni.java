package Pozoriste;

public abstract class Zaposleni {

    private String ime;
    private Pozoriste pozoriste;



    public Zaposleni(String ime, Pozoriste poz) {
        this.ime = ime;
        this.pozoriste = poz;


    }
    public String getIme() {
        return ime;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }


    public abstract String imePosla();

    @Override
    public String toString() {
        return "Zaposleni{" +
                "ime='" + ime + '\'' +
                ", pozoriste=" + pozoriste +
                '}';
    }
}
