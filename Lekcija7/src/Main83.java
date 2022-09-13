import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main83 {


    public static void main(String[] args) {

        ArrayList<Integer> celiBrojevi = new ArrayList<>();

        celiBrojevi.add(2);
        celiBrojevi.add(3);
        celiBrojevi.add(4);
        celiBrojevi.add(3);
        celiBrojevi.add(2);
        prikaziListu(celiBrojevi);
        celiBrojevi.remove(2);
        System.out.println("Nakon uklanjanja 3 elem");
        prikaziListu(celiBrojevi);
        celiBrojevi.remove(Integer.valueOf(2));
        System.out.println("Nakon uklanjanja 2");
        prikaziListu(celiBrojevi);


        ArrayList<Double> realniBrojevi = new ArrayList<>();
        System.out.println("Unesi realne brojeve(-1 za prekid)");
        Scanner scanner = new Scanner(System.in);
        double broj = Double.parseDouble(scanner.nextLine());

        while (broj != -1) {
            realniBrojevi.add(broj);
            broj = Double.parseDouble(scanner.nextLine());
        }
        prikaziListuRealnih(realniBrojevi);
        realniBrojevi.remove(0);
        System.out.println("Nakon uklanjanja el:");
        prikaziListuRealnih(realniBrojevi);

    }

    public static void prikaziListu(ArrayList<Integer> lista) {

        for (int broj : lista) {
            System.out.println(broj + " ");
        }
    }

    public static void prikaziListuRealnih(ArrayList<Double> lista) {
        for (double broj : lista) {

            System.out.println(broj + " ");
        }
    }

}
