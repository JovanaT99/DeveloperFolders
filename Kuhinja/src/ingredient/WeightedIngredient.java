package ingredient;

public class WeightedIngredient extends Ingredient {

    private double weight;
    private double pricePerUnit;

    public WeightedIngredient(String name, double pricePerUnit, UnitOfMeasure unitOfMeasure) {
        super(name, unitOfMeasure);
        this.pricePerUnit = pricePerUnit;
    }

    public WeightedIngredient(WeightedIngredient weightedIngredient) {
        super(weightedIngredient.getName(), weightedIngredient.getUnitOfMeasure());
        this.setId(weightedIngredient.getId());
        this.weight = weightedIngredient.getWeight();
        this.pricePerUnit = weightedIngredient.pricePerUnit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return weight * pricePerUnit;
    }

    @Override
    public String toString() {
        String ingredientStr = "ID: " + getId() +
                " | Name: " + getName() +
                " | Price per " + getUnitOfMeasure().toString() + ": " + pricePerUnit +
                " | " + "Total price: " + getPrice() + "\n";
        return ingredientStr + "-".repeat(ingredientStr.length());
    }
}
