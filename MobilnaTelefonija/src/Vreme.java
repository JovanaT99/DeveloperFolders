public class Vreme {


    private int sat;
    private int minut;
    private int sekuna;

    public Vreme(int sat, int minut, int sekuna) {
        this.sat = sat;
        this.minut = minut;
        this.sekuna = sekuna;
    }

    public Vreme(Vreme v) {

        this(v.sat, v.minut, v.sekuna);
    }

    public int getSat() {
        return sat;
    }

    public int getMinut() {
        return minut;
    }

    public int getSekuna() {
        return sekuna;
    }

    public Vreme sledeciMinut() {


        if (minut + 1 < 59) {
            return new Vreme(sat, minut + 1, 0);
        } else

            return new Vreme(sat + 1, 0, 0);
    }

    public static boolean validan(int sat, int minut, int sekuna) {

        return sat >= 0 && minut >= 0 && minut <= 59 && sekuna >= 0 && sekuna <= 59;
    }

    @Override
    public String toString() {
        return "Vreme{" +
                "sat=" + sat +
                ", minut=" + minut +
                ", sekuna=" + sekuna +
                '}';
    }
}
