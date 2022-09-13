import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;

public class DbIngredient {
    Scanner scanner;
    HashMap<Integer, Ingredient> ingredientsdb = new HashMap<>();

    public DbIngredient() {
        scanner = new Scanner(System.in);
    }

    public void addIngredient() {
        String name;
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Choose Unit: 1 for grams, 2 for kilograms, 3 for liters, 4 for milliliters, 5 for peace");
        int unit;
        unit = scanner.nextInt();
        System.out.println("Enter price:");
        double price;
        price=scanner.nextDouble();

    }
}
