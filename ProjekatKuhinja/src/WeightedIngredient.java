public class WeightedIngredient extends Ingredient {

    private double weight;
    private double pricePerUnit;
    private Unit unit;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return weight * pricePerUnit;
    }

    @Override
    public void setPrice(double price) {
        pricePerUnit = pricePerUnit;
    }
}
