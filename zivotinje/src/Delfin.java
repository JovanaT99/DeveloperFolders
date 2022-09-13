public class Delfin implements Kretanje {

    String ime;

    public Delfin(String ime) {
        this.ime = ime;
    }

    @Override
    public int kreciSe() {
        return PLIVA;
    }

    @Override
    public String toString() {
        return "Delfin{" +
                "ime='" + ime + '\'' +
                '}';
    }
}
