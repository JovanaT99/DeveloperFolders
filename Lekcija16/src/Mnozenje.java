import java.util.Scanner;

public class Mnozenje extends Operacija {


    public Mnozenje(String naziv) {
        super(naziv);
    }

    @Override
    public void Izvrsi(Scanner scanner) {
        System.out.println("Unesi prvi broj:");
        int broj1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Unesi drugi broj:");
        int broj2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proizvod je:" + ( broj1 * broj2));

    }
}
