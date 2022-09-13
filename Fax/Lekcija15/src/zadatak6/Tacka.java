package zadatak6;

public class Tacka {

    protected int x;
    protected int y;

    public Tacka(int x, int y) {

        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tacka{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


    public String lokacija() {

        return x + "," + y;
    }

    public double rastjanjeKoordiantnog() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public int menhetnRastojanje() {

        return Math.abs(x) + Math.abs(y);
    }

}
