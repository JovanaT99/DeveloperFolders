package zadatak5;

public class Motor extends AutoDeo {

    private String tip;

    public Motor(String sifra, String proizvodjac, String opis, String tip) {
        super(sifra, proizvodjac, opis);
        this.tip = tip;

    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return super.toString() + "-" + tip;
    }
}
