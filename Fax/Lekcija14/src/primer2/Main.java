package primer2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Knjiga knjiga = new Knjiga("Na Drini curpija", "Ivo Andric", 1950);
        System.out.println(knjiga);
        Knjiga knjiga1 = new Knjiga("Na Drini curpija", "Ivo Andric", 1950);

        if (knjiga.equals(knjiga1)) {
            System.out.println("Knjige su jednake");
        } else {
            System.out.println("Knjige nisu jednake");
        }

        Knjiga k3 = knjiga;

        if (k3.equals(knjiga1)) {
            System.out.println("Knjige su jednake");
        } else {
            System.out.println("Knjige nisu jednake");
        }


        ArrayList<Knjiga> knjige = new ArrayList<>();
        knjige.add(knjiga);
        knjige.add(knjiga1);
        knjige.add(new Knjiga("Prokleta Avlija", "Ivo Andric", 1900));


        if (knjige.contains(knjiga)) {
            System.out.println("U listi postoji" + knjiga);
        } else {

            System.out.println("Ne postoji");
        }


        HashMap<Knjiga, String> stringHashMap = new HashMap<>();
        stringHashMap.put(knjiga, "Pera Peric");
        stringHashMap.put(
                new Knjiga("Prokleta Avlija", "Ivo Andric", 1945), "Mika Mikic");

        stringHashMap.put(knjiga1, "Boza Bozic");


        String komeJeIzdata = stringHashMap.get(new Knjiga("Prokleta Avlija", "Ivo Andric", 1945));




    }
}
