import java.util.Scanner;

public class OsobaSC {

    String ime;
    String prezime;
    int godine;

    public OsobaSC(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
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

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void ostari() {
        this.godine++;
    }


    @Override
    public String toString() {
        return "OsobaSC{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                '}';
    }
}
