package ingredient;

public class SingleIngredient extends Ingredient {

    private double price;

    public SingleIngredient(String name, double price) {
        super(name, UnitOfMeasure.PIECE);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
