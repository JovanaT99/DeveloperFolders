package recipe;

import utils.Color;
import utils.StringUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class RecipeBook {
    private static RecipeBook instance = null;
    private int idCount = 0;

    private HashMap<Integer, Recipe> recipes = new HashMap<>();

    private RecipeBook(){
        populateDB();
    }

    public static RecipeBook getInstance() {
        if (instance == null) {
            return instance = new RecipeBook();
        } else {
            return instance;
        }
    }

    public void insertRecipe(Recipe recipe) throws RecipeHasNoIngredientsException {
        if (!recipe.getIngredients().isEmpty()) {
            recipe.setId(idCount++);
            recipes.put(recipe.getId(), recipe);
        } else {
            throw new RecipeHasNoIngredientsException("Recipe doesn't have ingredients");
        }
    }

    public void removeRecipe(int recipeId) throws NoSuchRecipeException {
        boolean recipeExists = false;
        String recipeName = "";
        for (Recipe recipe : recipes.values()) {
            if (recipe.getId() == recipeId) {
                recipeExists = true;
                recipeName = recipe.getName();
            }
        }
        if (recipeExists) {
            recipes.remove(recipeId);
            System.out.println(StringUtils.coloredText("Recipe '" + recipeName + "' removed", Color.ANSI_RED));
        } else {
            throw new NoSuchRecipeException("No recipe with id: " + recipeId);
        }
    }

    public HashMap<Integer, Recipe> getAllRecipes() {
        return recipes;
    }

    private void populateDB() {
        Recipe pancakes = new Recipe("Pancakes");
        pancakes.addIngredient(0, 1.0);
        pancakes.addIngredient(2, 500);

        Recipe whitePastaSouse = new Recipe("White pasta souse");
        whitePastaSouse.addIngredient(4, 300);

        Recipe redPastaSouse = new Recipe("Red pasta souse");
        redPastaSouse.addIngredient(3, 0.5);

        try {
            insertRecipe(pancakes);
            insertRecipe(whitePastaSouse);
            insertRecipe(redPastaSouse);
        } catch (RecipeHasNoIngredientsException e) {
            System.out.println(e.getMessage());
        }
    }
}
