import java.util.Scanner;

public abstract class Operacija {

    protected String naziv;


    public Operacija(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public abstract void Izvrsi(Scanner scanner);


}
