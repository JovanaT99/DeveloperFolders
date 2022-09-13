package glavni;

import uredjaji.GrupaPotrosaca;
import uredjaji.TipUredjaja;
import uredjaji.Uredjaj;

public class Program {


    public static void main(String[] args) {
        Uredjaj uredjaj=new Uredjaj(TipUredjaja.FRIZDER);
        //System.out.println(uredjaj);
        GrupaPotrosaca grupaPotrosaca=new GrupaPotrosaca(3);
        grupaPotrosaca.dodajPotrosace(uredjaj);
        grupaPotrosaca.dodajPotrosace(uredjaj);
        GrupaPotrosaca grupaPotrosaca1=new GrupaPotrosaca(1);
        Uredjaj uredjaj1=new Uredjaj(TipUredjaja.SIJALICA);
        grupaPotrosaca1.dodajPotrosace(uredjaj1);
        GrupaPotrosaca grupaPotrosaca2=new GrupaPotrosaca(1);
        Uredjaj uredjaj2=new Uredjaj(TipUredjaja.FRIZDER);
        grupaPotrosaca2.dodajPotrosace(uredjaj2);
        System.out.println(grupaPotrosaca);
        System.out.println(grupaPotrosaca.equals(grupaPotrosaca1));
        System.out.println(grupaPotrosaca.equals(grupaPotrosaca2));


    }
}
