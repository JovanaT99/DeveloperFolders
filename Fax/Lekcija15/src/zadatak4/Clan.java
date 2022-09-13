package zadatak4;

public class Clan implements Comparable<Clan> {


    private String ime;
    private int visina;


    public Clan(String ime, int visina) {
        this.ime = ime;
        this.visina = visina;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }


    @Override
    public String toString() {
        return "Clan{" +
                "ime='" + ime + '\'' +
                ", visina=" + visina +
                '}';
    }

    @Override
    public int compareTo(Clan o) {
        if (this.visina < o.visina) {
            return -1;
        } else if (this.visina > o.visina) {
            return 1;
        } else {
            return 0;
        }

    }
}





