package kitchen;

import fridge.FridgeMenu;
import ingredient.IngredientMenu;
import menu.Menu;
import recipe.RecipeMenu;
import utils.Color;
import utils.StringUtils;

import java.util.LinkedHashMap;

public class KitchenMenu extends Menu {

    private IngredientMenu ingredientMenu;
    private FridgeMenu fridgeMenu;
    private RecipeMenu recipeMenu;
    public KitchenMenu() {
        this.ingredientMenu = new IngredientMenu();
        this.fridgeMenu = new FridgeMenu();
        this.recipeMenu = new RecipeMenu();
    }

    @Override
    public String initializeMenuName() {
        return "Welcome to " + StringUtils.coloredText("Jovana's", Color.ANSI_PURPLE) +" kitchen!";
    }

    @Override
    public LinkedHashMap<Integer, String> initializeMenuOptions() {
        LinkedHashMap<Integer, String> kitchenMenu = new LinkedHashMap<>();
        kitchenMenu.put(1, StringUtils.coloredText("Fridge", Color.ANSI_CYAN));
        kitchenMenu.put(2, StringUtils.coloredText("Ingredients", Color.ANSI_BLUE));
        kitchenMenu.put(3, StringUtils.coloredText("Recipes", Color.ANSI_YELLOW));
        kitchenMenu.put(0, StringUtils.coloredText("Exit", Color.ANSI_RED));
        return kitchenMenu;
    }
    @Override
    public void onMenuOptionSelected(int menuOption) {
        switch (menuOption) {
            case 1 -> fridgeMenu.showMenu();
            case 2 -> ingredientMenu.showMenu();
            case 3 -> recipeMenu.showMenu();
            case 0 -> exit();
        }
    }

    private void loadRecipes() {

    }

    private void exit() {

    }
}
