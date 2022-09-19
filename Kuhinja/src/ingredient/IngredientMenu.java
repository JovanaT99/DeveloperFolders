package ingredient;

import kitchen.KitchenMenu;
import menu.Menu;
import utils.Color;
import utils.StringUtils;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class IngredientMenu extends Menu {

    @Override
    public String initializeMenuName() {
        return StringUtils.coloredText("Ingredients:", Color.ANSI_BLUE);
    }

    @Override
    public LinkedHashMap<Integer, String> initializeMenuOptions() {
        LinkedHashMap<Integer, String> ingredientMenu = new LinkedHashMap<>();
        ingredientMenu.put(1,"List of ingredients");
        ingredientMenu.put(2,"Search ingredient");
//        ingredientMenu.put(3,"Remove ingredient");
        ingredientMenu.put(0, StringUtils.coloredText("Back", Color.ANSI_RED));
        return ingredientMenu;
    }
    @Override
    public void onMenuOptionSelected(int menuOption) {
        switch (menuOption) {
            case 1 -> showAllIngredients();
            case 2 -> searchIngredient();
            case 0 -> new KitchenMenu().showMenu();
        }
    }

    private void showAllIngredients() {
        for (Ingredient ingredient: IngredientsDB.getInstance().getAllIngredients().values()) {
            System.out.println(ingredient);
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        try {
            System.in.read();
            showMenu();
        } catch (IOException e) {
            showMenu();
        }
    }

    private void searchIngredient() {

        if (IngredientsDB.getInstance().getAllIngredients().isEmpty()) {
            System.out.println(StringUtils.coloredText("There are no ingredients in DB!", Color.ANSI_RED));
        } else {
            System.out.println(StringUtils.coloredText("Enter the name of ingredient you wish to search or 'cancel' to cancel.", Color.ANSI_BLUE));
            String searchQuery = new Scanner(System.in).nextLine();
            if (!searchQuery.equalsIgnoreCase("cancel")) {
                try {
                    var searchResults = IngredientsDB.getInstance().searchIngredientByName(searchQuery);
                    searchResults.forEach(System.out::println);
                } catch (NoSuchIngredientException e) {
                    System.out.println(StringUtils.coloredText(e.getMessage(), Color.ANSI_RED));
                }
            }
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }
}
