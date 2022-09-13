package zaposleni;

import java.util.Random;

public class Sala {


    Random random = new Random();
    private int id;
    private String naziv;
    private String  tip;
    private int brojOsoba;


    public Sala( String naziv, String tip, int brojOsoba) {
        id = random.nextInt(1000);
        this.naziv = naziv;
        this.tip = tip;
        this.brojOsoba = brojOsoba;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getBrojOsoba() {
        return brojOsoba;
    }

    public void setBrojOsoba(int brojOsoba) {
        this.brojOsoba = brojOsoba;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "random=" + random +
                ", id=" + id +
                ", naziv='" + naziv + '\'' +
                ", tip='" + tip + '\'' +
                ", brojOsoba=" + brojOsoba +
                '}';
    }
}
