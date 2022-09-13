import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipe implements Priceable {
    Scanner scanner;
    private String name;
    private Difficulty difficulty;
    private double price = 0;
    private List<WeightedIngredient> weightedIngredients = new ArrayList<>();
    private List<Ingredient> ingredients = new ArrayList<>();

    public Recipe() {
        scanner = new Scanner(System.in);
    }

    @Override
    public double getPrice() {
        List<Ingredient> allIngredients = new ArrayList<>();
        allIngredients.addAll(ingredients);
        allIngredients.addAll(weightedIngredients);
        for (Ingredient ingredient : allIngredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    public void addIngredient() {

        System.out.println("Choose ingredient:");
        System.out.println();
    }
}
