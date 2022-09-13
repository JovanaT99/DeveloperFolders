package Zadatak1;

public class Osoba {

    private String ime;
    private String prezime;
    int godine;


    public Osoba(String ime, String prezime, int godine) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    @Override
    public String toString() {
        return "Zadatak1.Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                '}';
    }

    public boolean isPunoletan(){

        return godine>17;
    }


    public boolean nijePunoletna(){

        return !isPunoletan();

    }
}
