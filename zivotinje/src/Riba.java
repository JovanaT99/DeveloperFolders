public class Riba implements Kretanje {

    String ime;
    String vrsta;

    public Riba(String ime, String vrsta) {
        this.ime = ime;
        this.vrsta = vrsta;
    }


    @Override
    public int kreciSe() {
        return PLIVA;
    }

    @Override
    public String toString() {
        return "Riba{" +
                "ime='" + ime + '\'' +
                ", vrsta='" + vrsta + '\'' +
                '}';
    }

}
