package fridge;

import ingredient.Ingredient;
import ingredient.WeightedIngredient;

public class FridgeItem {
    private WeightedIngredient ingredient;
    private Double amount;

    public FridgeItem(WeightedIngredient ingredient, Double amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public FridgeItem() {
    }

    public WeightedIngredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(WeightedIngredient ingredient) {
        this.ingredient = ingredient;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ID: " + ingredient.getId() +
                " ".repeat(5 - String.valueOf(ingredient.getId()).length()) +
                ingredient.getName() +
                " ".repeat(20-ingredient.getName().length()) + amount + ingredient.getUnitOfMeasure().toString() + " " + ingredient.getPrice();
    }
}
