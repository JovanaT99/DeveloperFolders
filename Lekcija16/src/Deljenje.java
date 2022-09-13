import java.util.Scanner;

public class Deljenje extends Operacija {


    public Deljenje(String naziv) {
        super(naziv);
    }

    @Override
    public void Izvrsi(Scanner scanner) {
        System.out.println("Unesi prvi broj:");
        int broj1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Unesi drugi broj:");
        int broj2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Kolicnik je:" + ((double) broj1 / broj2));

    }
}
