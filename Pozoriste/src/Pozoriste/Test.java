package Pozoriste;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Pozoriste p1 = new Pozoriste("Slavija");
        System.out.println(p1.getId());
        Pozoriste p2 = new Pozoriste("Jugoslovensko dramsko pozoriste");
        System.out.println(p2.getId());


        Glumac g = new Glumac("Pera",p1);
        Glumac g2 = new Glumac("Zdera",p1);
        Reditelj r = new Reditelj("Iva Milosevic", p1);
        Kostimograf k = new Kostimograf("Maja Mirkovic", p1);

        List<Zaposleni> zaposleni = new ArrayList<>();
        zaposleni.add(g);
        zaposleni.add(g2);
        zaposleni.add(r);
        zaposleni.add(k);

        for(Zaposleni z : zaposleni){
            System.out.println(z.getIme() + " " + z.imePosla());
        }
    }
}
