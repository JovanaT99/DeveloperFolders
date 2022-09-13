package zadatak5;

public class AutoDeo {


    private String sifra;
    private String proizvodjac;
    private String opis;


    public AutoDeo(String sifra, String proizvodjac, String opis) {
        this.sifra = sifra;
        this.proizvodjac = proizvodjac;
        this.opis = opis;
    }


    public String getSifra() {
        return sifra;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public String getOpis() {
        return opis;
    }

    @Override
    public String toString() {
        return "AutoDeo{" +
                "sifra='" + sifra + '\'' +
                ", proizvodjac='" + proizvodjac + '\'' +
                ", opis='" + opis + '\'' +
                '}';
    }
}
