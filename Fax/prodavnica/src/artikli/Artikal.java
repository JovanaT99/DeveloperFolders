package artikli;

public class Artikal {

    String naziv;
    int kolicina=0;
    int cena;

    public Artikal(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCenaZaKolicinu() {
        return cena * kolicina;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

}

