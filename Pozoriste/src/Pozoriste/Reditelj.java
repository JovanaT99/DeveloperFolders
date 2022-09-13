package Pozoriste;

public class Reditelj extends Zaposleni{

    public Reditelj(String ime,Pozoriste poz) {
        super(ime, poz);
    }

    @Override
    public String imePosla() {
        return "Reditelj";
    }
}
