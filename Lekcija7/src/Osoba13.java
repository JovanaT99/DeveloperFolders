public class Osoba13 {


    private String ime;
    private String prezime;
    private int godine;


    public Osoba13(String ime, String prezime, int godine) {
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

    public boolean jePunoletna() {

        if (godine > 17) {

            return true;
        }
        else{
            return false;
        }
    }


}
