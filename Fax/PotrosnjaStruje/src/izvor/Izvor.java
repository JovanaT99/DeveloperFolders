package izvor;

import uredjaji.Potrosac;

import java.util.ArrayList;
import java.util.HashMap;

public class Izvor implements Uputsvo {

    int maxBrojPrikljucaka;
    int strujniKapacitet;

    ArrayList<Potrosac> prikljuci;

    public Izvor(int maxBrojPrikljucaka, int strujniKapacitet) {
        this.maxBrojPrikljucaka = maxBrojPrikljucaka;
        this.strujniKapacitet = strujniKapacitet;
        prikljuci = new ArrayList<>(maxBrojPrikljucaka);
    }

    public void prikljuciUredjaj(Potrosac potrosac) {

        if (prikljuci.size() > maxBrojPrikljucaka) {
            System.out.println("Izvor ima max broj potrosaca");
            return;
        }

        if (potrosac.snagaPotrosnje() <= preostaliKapacitet()) {
            prikljuci.add(potrosac);
            System.out.println("Dodat potrosac");
        } else {
            System.out.println("Izvor preoterecen");
        }
    }

    public void iskljuciPotrosaca(int prikljucak) {
        prikljuci.remove(prikljucak);
        System.out.println("Prikljucak iskljucen");
    }


    @Override
    public Potrosac najveciPotrosac() {
        double max = Double.MIN_VALUE;
        Potrosac najveciPotrosac = null;
        for (Potrosac potrosac : prikljuci) {
            if (potrosac.snagaPotrosnje() > max) {
                najveciPotrosac = potrosac;
                max = potrosac.snagaPotrosnje();
            }
        }
        return najveciPotrosac;
    }

    @Override
    public Potrosac najmanjiPotrosac() {
        double min = Double.MAX_VALUE;
        Potrosac najmanjiPotrosac = null;
        for (Potrosac potrosac : prikljuci) {
            if (potrosac.snagaPotrosnje() < min) {
                najmanjiPotrosac = potrosac;
                min = potrosac.snagaPotrosnje();
            }
        }
        return najmanjiPotrosac;
    }

    @Override
    public int ukupnaPotrosnja() {

        int trenutniKapacitet = 0;

        for (Potrosac potrosac1 : prikljuci) {

            trenutniKapacitet += potrosac1.snagaPotrosnje();
        }
        return trenutniKapacitet;
    }

    @Override
    public int preostaliKapacitet() {
        return strujniKapacitet - ukupnaPotrosnja();

    }


}
