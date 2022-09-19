package recipe;

import ingredient.Ingredient;
import ingredient.IngredientsDB;
import ingredient.Priceable;
import ingredient.WeightedIngredient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Recipe implements Priceable {

    private int id;
    private String name;
    private double price;
    private ArrayList<WeightedIngredient> ingredients = new ArrayList<>();

    public Recipe(String name) {
        this.name = name;
        this.price = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addIngredient(int ingredientId, double amount) {
        WeightedIngredient ingredient = new WeightedIngredient(IngredientsDB.getInstance().getIngredientById(ingredientId));
        ingredient.setWeight(amount);
        ingredients.add(ingredient);
    }

    public ArrayList<WeightedIngredient> getIngredients() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (WeightedIngredient ingredient: ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        StringBuilder ingredientStr = new StringBuilder("ID: " + getId() +
                " | Name: " + getName() +
                " | Price: " + getPrice() + "\n");
        for (WeightedIngredient weightedIngredient : ingredients) {
            ingredientStr.append("* ").append(weightedIngredient.getName());
            ingredientStr.append(" - ").append(weightedIngredient.getWeight()).append(weightedIngredient.getUnitOfMeasure().toString()).append(" \n");
        }
        return ingredientStr + "-".repeat(ingredientStr.length());
    }
}
