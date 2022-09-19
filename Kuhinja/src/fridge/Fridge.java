package fridge;

import ingredient.WeightedIngredient;

import java.util.ArrayList;

public class Fridge {

    private static Fridge instance = null;

    private ArrayList<WeightedIngredient> fridgeItems = new ArrayList<>();

    private Fridge() {}

    public static Fridge getInstance() {
        if (instance == null) {
            return instance = new Fridge();
        } else {
            return instance;
        }
    }

    public void putIngredientInFridge(WeightedIngredient ingredient) {
        boolean itemExists = false;

        for (WeightedIngredient fridgeIngredient: fridgeItems) {
            if (fridgeIngredient.getId() == ingredient.getId()) {
                double newAmount = fridgeIngredient.getWeight() + ingredient.getWeight();
                fridgeIngredient.setWeight(newAmount);
                itemExists = true;
            }
        }
        if(!itemExists) {
            fridgeItems.add(ingredient);
        }
    }

    public void removeFridgeItem(int ingredientId, double amount) {
        boolean remove = false;
        for (WeightedIngredient fridgeIngredient: fridgeItems) {
            if (fridgeIngredient.getId() == ingredientId) {
                double newAmount = fridgeIngredient.getWeight() - amount;
                fridgeIngredient.setWeight(newAmount);
                remove = fridgeIngredient.getWeight() <=0;
            }
        }
        if(remove) {
            fridgeItems.remove(getFridgeItem(ingredientId));
        }
    }

    public void removeFridgeItem(int ingredientId) {
        fridgeItems.remove(getFridgeItem(ingredientId));
    }

    public ArrayList<WeightedIngredient> getFridgeItems() {
        return fridgeItems;
    }

    public WeightedIngredient getFridgeItem(int ingredientID) {
        WeightedIngredient fridgeIngredient = null;
        for (WeightedIngredient wi: fridgeItems){
            if (wi.getId() == ingredientID) {
                fridgeIngredient = wi;
            }
        }
        return fridgeIngredient;
    }

    public double getTotalIngredientPrice(){
        double totalPrice = 0.0;
        for (WeightedIngredient fridgeIngredient: fridgeItems) {
            totalPrice += fridgeIngredient.getPrice();
        }
        return totalPrice;
    }
}
