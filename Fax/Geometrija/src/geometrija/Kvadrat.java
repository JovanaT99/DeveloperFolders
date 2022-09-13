package geometrija;

public class Kvadrat extends Figura {


    int a;
    int b;
    int c;
    String oznaka = "KV";

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public boolean isCube() {


        return true;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", oznaka='" + oznaka + '\'' +
                "- " + izracunajPovrsinu() +
                " " + izracunajZapreminu() +
                '}';
    }

    @Override
    public double izracunajPovrsinu() {

        if (isCube()) {

            return 6 * Math.pow(a, 2);
        } else {

            return Math.pow(a, 2);
        }
    }

    @Override
    public double izracunajZapreminu() {

        if (isCube()) {

            return Math.pow(a, 3);
        } else {

            return 0;
        }
    }
}

