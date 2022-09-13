package Pozoriste;

public class Glumac extends Zaposleni {


    public Glumac(String ime, Pozoriste poz) {
        super(ime, poz);
    }

    @Override
    public String imePosla() {
        return "Glumac";
    }
}
