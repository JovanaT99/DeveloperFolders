package geometrija;

public abstract class Figura {

    double zapremina = 0;
    double povrsina = 0;

    public double izracunajPovrsinu() {

        return povrsina;
    }

    public double izracunajZapreminu() {
        return zapremina;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "zapremina=" + zapremina +
                ", povrsina=" + povrsina +
                '}';
    }
}
