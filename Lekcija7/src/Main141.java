import java.util.ArrayList;
import java.util.HashMap;

public class Main141 {
    public static void main(String[] args) {


        Knjiga411 knjiga411 = new Knjiga411("Na Drini Cuprija",
                "Ivo Andric",
                1945);
        System.out.println(knjiga411);

        Knjiga411 knjiga4111 = new Knjiga411("Na Drini Cuprija",
                "Ivo Andric",
                1945);

        if (knjiga411.equals(knjiga4111)) {

            System.out.println("Knjige su jednake");
        } else {
            System.out.println("Knjige nisu jednake");
        }

        Knjiga411 knjiga4112 = knjiga411;

        if (knjiga4112.equals(knjiga411)) {

            System.out.println("Knjige su jednake");
        } else {
            System.out.println("Knjige nisu jednake");
        }

        ArrayList<Knjiga411> knjige = new ArrayList<>();
        knjige.add(knjiga411);
        knjige.add(knjiga4111);
        knjige.add(new Knjiga411("Prokleta Avlija", "Ivo Andric", 1954));


        if (knjige.contains(knjiga411)) {
            System.out.println("Postoji knjiga u listi");
        } else {
            System.out.println("Ne postoji knjiga u listi");
        }

        HashMap<Knjiga411, String>biblioteka=new HashMap<>();
        biblioteka.put(knjiga411,"Pera Peric");
        biblioteka.put(new Knjiga411("Prokleta Avlija","Ivo Andric",1954), "Mika Milic");

        biblioteka.put(knjiga4111,"Boza Bozic");

        String izdataKome=biblioteka.get(new Knjiga411("Prokleta Avlija",
                "Ivo Andric",
                1954));
        System.out.println(izdataKome);


    }
}
