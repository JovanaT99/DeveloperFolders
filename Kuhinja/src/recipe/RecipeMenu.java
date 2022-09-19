package recipe;

import kitchen.KitchenMenu;
import menu.Menu;
import utils.Color;
import utils.StringUtils;

import java.util.*;

public class RecipeMenu extends Menu {

    @Override
    public String initializeMenuName() {
        return StringUtils.coloredText("Recipe:", Color.ANSI_YELLOW);
    }

    @Override
    public LinkedHashMap<Integer, String> initializeMenuOptions() {
        LinkedHashMap<Integer, String> recipeMenu = new LinkedHashMap<>();
        recipeMenu.put(1,"All recipes");
        recipeMenu.put(2,"Remove recipe");
        recipeMenu.put(3,"Show what can be made with given budget");
        recipeMenu.put(4,"Show all recipes by price - ascending");
        recipeMenu.put(5,"Show all recipes by price - descending");
        recipeMenu.put(0, StringUtils.coloredText("Back", Color.ANSI_RED));
        return recipeMenu;
    }
    @Override
    public void onMenuOptionSelected(int menuOption) {
        switch (menuOption) {
            case 1 -> showAllRecipes();
            case 2 -> removeRecipe();
            case 3 -> showRecipesByBudget();
            case 4 -> showAllRecipesByPriceAscending();
            case 5 -> showAllRecipesByPriceDescending();
            case 0 -> new KitchenMenu().showMenu();
        }
    }

    private void showRecipesByBudget() {
        System.out.println(StringUtils.coloredText("Enter your budget:", Color.ANSI_YELLOW));
        double budget = new Scanner(System.in).nextDouble();
        ArrayList<Recipe> recipes = whatCanBeMadeWithBudget(budget);
        if (recipes.isEmpty()) {
            System.out.println(StringUtils.coloredText("Sorry, nothing can be made with that budget...", Color.ANSI_RED));
        } else {
            recipes.forEach(System.out::println);
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }

    private ArrayList<Recipe> whatCanBeMadeWithBudget(double budget) {
        ArrayList<Recipe> recipesInBudget = new ArrayList<>();
        for (Recipe recipe : RecipeBook.getInstance().getAllRecipes().values()) {
            if (recipe.getPrice() <= budget) {
                recipesInBudget.add(recipe);
            }
        }
        return recipesInBudget;
    }

    private void showAllRecipes() {
        RecipeBook.getInstance().getAllRecipes().values().forEach(System.out::println);
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }

    private void showAllRecipesByPriceAscending() {
        ArrayList<Recipe> sortedByPrice = new ArrayList<>(RecipeBook.getInstance().getAllRecipes().values());
        sortedByPrice.sort((recipe1, recipe2) -> (recipe1.getPrice() > recipe2.getPrice() ? 0 : -1));
        sortedByPrice.forEach(System.out::println);
        System.out.println(StringUtils.coloredText("Press enter to continue",Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }

    private void showAllRecipesByPriceDescending() {
        ArrayList<Recipe> sortedByPrice = new ArrayList<>(RecipeBook.getInstance().getAllRecipes().values());
        sortedByPrice.sort((recipe1, recipe2) -> (recipe1.getPrice() < recipe2.getPrice() ? 0 : -1));
        sortedByPrice.forEach(System.out::println);
        System.out.println(StringUtils.coloredText("Press enter to continue",Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }
    private void removeRecipe() {
        RecipeBook.getInstance().getAllRecipes().values().forEach(System.out::println);
        System.out.println(StringUtils.coloredText("Enter the ID of the recipe you wish to remove or '-1' to cancel.", Color.ANSI_BLUE));
        int recipeId = new Scanner(System.in).nextInt();
        if (recipeId == -1) {
            showMenu();
            return;
        }
        try {
            RecipeBook.getInstance().removeRecipe(recipeId);
        } catch (NoSuchRecipeException e) {
            System.out.println(StringUtils.coloredText(e.getMessage(), Color.ANSI_RED));
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }
}
