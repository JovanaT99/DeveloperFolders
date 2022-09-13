import java.util.ArrayList;
import java.util.Random;

public class Lutrija {

    private Random generator;
    private ArrayList<Integer> brojevi;

    public Lutrija() {
        generator = new Random();
        brojevi = new ArrayList<>();
    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }

    public void izvuciBroj() {
        while (true) {
            int broj = generator.nextInt(39) + 1;
            if (daLiJeUListi(broj)) {
                continue;
            }
            brojevi.add(broj);
            break;
        }
    }

    public boolean daLiJeUListi(int broj) {
        for (int br : brojevi) {

            if (br == broj) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String pomocna = "";
        for (int i = 0; i < brojevi.size() - 1; i++) {
            pomocna += brojevi.get(i) + ",";
        }
        pomocna += brojevi.size() - 1;
        return pomocna;
    }

    public int brojPogadaka(ArrayList<Integer> brojevi) {
        int pogodak = 0;
        for (int b : this.brojevi) {
            for (int brKorisnika : brojevi) {

                if (b == brKorisnika) {
                    pogodak++;
                    break;
                }
            }

        }
        return pogodak;

    }
}
