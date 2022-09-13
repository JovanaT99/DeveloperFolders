public class Osoba92 {
    public Osoba92(String ime, String prezime, int godine, int visina, int telesnaMasa) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.visina = visina;
        this.telesnaMasa = telesnaMasa;
    }

    private String ime;
    private String prezime;
    private int godine;
    private int visina;
    private int telesnaMasa;


    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    public int getVisina() {
        return visina;
    }

    public int getTelesnaMasa() {
        return telesnaMasa;
    }


    @Override
    public String toString() {
        return "Osoba92{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", visina=" + visina +
                ", telesnaMasa=" + telesnaMasa +
                '}';
    }

    public double indexTelesneMase() {

        double m = visina / 100.0;
        return telesnaMasa / (m * m);

    }
}
