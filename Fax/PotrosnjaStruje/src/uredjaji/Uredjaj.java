package uredjaji;

public class Uredjaj implements Potrosac {

    TipUredjaja tipUredjaja;
    public Uredjaj(TipUredjaja tipUredjaja) {
        this.tipUredjaja=tipUredjaja;
    }

    @Override
    public double snagaPotrosnje() {
        return tipUredjaja.getSnaga();
    }

    @Override
    public String toString() {
        return tipUredjaja.name() +
                " [" + tipUredjaja.getSnaga() + "]";
    }
}
