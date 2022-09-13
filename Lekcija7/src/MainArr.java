import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainArr {

    public static void main(String[] args) {
        ArrayList<String> gradovi = new ArrayList<>();
        gradovi.add("Beograd");
        gradovi.add("Novi Sad");
        gradovi.add("Kragujevac");
        gradovi.add("Nis");
        gradovi.add("Subotica");
        gradovi.add("Jagodina");

        System.out.println(gradovi.get(0));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi dva grada");
        gradovi.add(scanner.nextLine());
        gradovi.add(scanner.nextLine());

        for (String g : gradovi) {

            System.out.println(g);
        }
        System.out.println(daLiPostoji(gradovi, 'Z'));
        Collections.sort(gradovi);
        for(String g: gradovi){
            System.out.println(g);
        }

    }

    public static boolean daLiPostoji(ArrayList<String> gradovi, char slovo) {

        for (String g : gradovi) {
            if (g.charAt(0) == slovo) {

                return true;
            }
        }
        return false;
    }
}
