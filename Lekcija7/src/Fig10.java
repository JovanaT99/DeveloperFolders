import java.util.Random;

public class Fig10 {

    private Random generator;
    private int brojStranica;


    public Fig10(int brojStranica) {
        this.brojStranica = brojStranica;
        generator = new Random();

    }

    public int baci() {
        return generator.nextInt(brojStranica) + 1;
    }
}
