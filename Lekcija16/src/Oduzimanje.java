import java.util.Scanner;

public class Oduzimanje extends Operacija{

    public Oduzimanje(String naziv) {
        super(naziv);
    }

    @Override
    public void Izvrsi(Scanner scanner) {
        System.out.println("Unesi prvi broj:");
        int broj1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Unesi drugi broj:");
        int broj2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Oduzimanje:" + ( broj1 -broj2));

    }
}
