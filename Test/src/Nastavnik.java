public class Nastavnik {


    private String ime;
    private String prezime;
    private int radnoVreme;
    private int radnoVremeDo;


    public Nastavnik(String ime, String prezime, int radnoVreme, int radnoVremeDo) {
        this.ime = ime;
        this.prezime = prezime;
        this.radnoVreme = radnoVreme;
        this.radnoVremeDo = radnoVremeDo;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getRadnoVreme() {
        return radnoVreme;
    }

    public void setRadnoVreme(int radnoVreme) {
        this.radnoVreme = radnoVreme;
    }

    public int getRadnoVremeDo() {
        return radnoVremeDo;
    }

    public void setRadnoVremeDo(int radnoVremeDo) {
        this.radnoVremeDo = radnoVremeDo;
    }


    @Override
    public String toString() {
        return ime + "" + prezime + "(" + radnoVreme + ")" + "(" + radnoVremeDo + ")";
    }
}
