package zadatak6;

public class Tacka3D extends Tacka {

    public int z;

    public Tacka3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public String toString() {

        return "T(" + super.x + "," + super.y + "," + this.z + ")";
    }

    @Override
    public double rastjanjeKoordiantnog() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z,2));
    }

    @Override
    public int menhetnRastojanje() {
        return super.menhetnRastojanje() + Math.abs(z);
    }
}
