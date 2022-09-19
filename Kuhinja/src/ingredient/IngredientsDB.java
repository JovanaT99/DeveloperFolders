package ingredient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IngredientsDB {

    private static IngredientsDB instance = null;
    private int idCount = 0;
    private HashMap<Integer, WeightedIngredient> ingredients = new HashMap<>();

    private IngredientsDB() {
        insertIngredient(new WeightedIngredient("Mleko", 149.99, UnitOfMeasure.LITRES));
        insertIngredient(new WeightedIngredient("Sir", 249.99, UnitOfMeasure.GRAMS));
        insertIngredient(new WeightedIngredient("Pavlaka", 49.99, UnitOfMeasure.GRAMS));
        insertIngredient(new WeightedIngredient("Junece Meso", 1249.99, UnitOfMeasure.KILOGRAMS));
        insertIngredient(new WeightedIngredient("Pavlaka za kuvanje", 229.99, UnitOfMeasure.MILLILITRES));
    }

    public static IngredientsDB getInstance() {
        if (instance == null) {
            return instance = new IngredientsDB();
        } else {
            return instance;
        }
    }

    public void insertIngredient(WeightedIngredient ingredient) {
        ingredient.setId(idCount++);
        ingredients.put(ingredient.getId(), ingredient);
    }

    public List<WeightedIngredient> searchIngredientByName(String name) throws NoSuchIngredientException {
        var searchedIngredients = ingredients.values().stream().filter(ingredient -> ingredient.getName().toLowerCase().contains(name.toLowerCase())).toList();
        if (searchedIngredients.isEmpty())
            throw new NoSuchIngredientException("There is no ingredient matching '" + name + "'");
        return searchedIngredients;
    }

    public List<WeightedIngredient> getIngredientsByIds(List<Integer> ingredientIds){
        List<WeightedIngredient> ingredientsByIds = new ArrayList<>();
        for (int ingredientId: ingredientIds) {
            ingredientsByIds.add(this.ingredients.get(ingredientId));
        }
        return ingredientsByIds;
    }

    public WeightedIngredient getIngredientById(Integer ingredientId) {
        return this.ingredients.get(ingredientId);
    }

    public HashMap<Integer, WeightedIngredient> getAllIngredients() {
        return this.ingredients;
    }

}
