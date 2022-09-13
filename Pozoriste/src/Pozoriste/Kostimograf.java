package Pozoriste;


public class Kostimograf extends Zaposleni {


    public Kostimograf(String ime, Pozoriste poz) {
        super(ime, poz);
    }

    @Override
    public String imePosla() {
        return "Kostimograf";
    }
}
