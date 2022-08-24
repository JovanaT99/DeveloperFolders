package artikli;

public class Voce extends Artikal {
    String tip;
    String jedinicaMere;

   public Voce(String naziv, int cena, String tip, String jedinicaMere) {
        super(naziv,cena);
        this.tip = tip;
        this.jedinicaMere = jedinicaMere;
    }

    public String getJedinicaMere() {
        return jedinicaMere;
    }

    @Override
    public String toString() {
        return naziv + "-" + tip + " [" + cena + "/" + jedinicaMere + "]";
    }
}
