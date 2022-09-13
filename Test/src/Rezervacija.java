import java.util.PrimitiveIterator;

public class Rezervacija implements Comparable<Rezervacija>{

private int daniUnedelji;

    public Rezervacija(int daniUnedelji) {
        this.daniUnedelji = daniUnedelji;
    }

    public int getDaniUnedelji() {
        return daniUnedelji;
    }

    public void setDaniUnedelji(int daniUnedelji) {
        this.daniUnedelji = daniUnedelji;
    }

    @Override
    public int compareTo(Rezervacija o) {
        return 0;
    }
}
