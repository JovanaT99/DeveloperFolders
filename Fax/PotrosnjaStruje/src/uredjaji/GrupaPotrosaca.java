package uredjaji;

import java.util.ArrayList;
import java.util.Objects;

public class GrupaPotrosaca implements Potrosac {


    ArrayList<Potrosac> potrosacs;

    public GrupaPotrosaca(int brojMesta) {

        this.potrosacs = new ArrayList<>(brojMesta);
    }

    public void dodajPotrosace(Potrosac potrosac) {

        potrosacs.add(potrosac);

    }

    @Override
    public double snagaPotrosnje() {
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GrupaPotrosaca that = (GrupaPotrosaca) o;
        int ukupno = 0;
        for (Potrosac potrosac : potrosacs) {
            ukupno += potrosac.snagaPotrosnje();
        }
        int ukupnoGrupa = 0;
        for (Potrosac potrosac : that.potrosacs) {

            ukupnoGrupa += potrosac.snagaPotrosnje();
        }

        return ukupno == ukupnoGrupa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(potrosacs);
    }

    @Override
    public String toString() {
        return "" + potrosacs;

    }
}
