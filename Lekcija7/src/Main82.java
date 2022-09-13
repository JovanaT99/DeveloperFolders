import java.util.ArrayList;
import java.util.Collections;

public class Main82 {
    public static void main(String[] args) {

        ArrayList<String> reci = new ArrayList<>();
        reci.add("Soba");
        reci.add("Zgrada");
        reci.add("Sveska");
        reci.add("Blok");
        reci.add("Stolica");
        reci.add("Kurs");

        for (String rec : reci) {
            System.out.println(rec);
        }
        Collections.sort(reci);
        System.out.println("---------------------------------");

        for (String rec : reci) {
            System.out.println(rec);
        }

        //Sort
        Collections.reverse(reci);
        System.out.println("<--------------------------------->");

        for (String rec : reci) {
            System.out.println(rec);
        }

        Collections.shuffle(reci);
        System.out.println("izmesan redosled");
        for (String rec : reci) {
            System.out.println(rec);
        }

    }
}
