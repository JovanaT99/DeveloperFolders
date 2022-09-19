package fridge;

import ingredient.Ingredient;
import ingredient.IngredientsDB;
import ingredient.WeightedIngredient;
import kitchen.KitchenMenu;
import menu.Menu;
import recipe.Recipe;
import recipe.RecipeBook;
import utils.Color;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class FridgeMenu extends Menu {

    @Override
    public String initializeMenuName() {
        return StringUtils.coloredText("Fridge:", Color.ANSI_CYAN);
    }

    @Override
    public LinkedHashMap<Integer, String> initializeMenuOptions() {
        LinkedHashMap<Integer, String> fridgeMenu = new LinkedHashMap<>();
        fridgeMenu.put(1, "Fridge content");
        fridgeMenu.put(2, "Put ingredient in fridge");
        fridgeMenu.put(3, "Remove ingredient from fridge");
        fridgeMenu.put(4, "What can be made with ingredients");
        fridgeMenu.put(5, "What can be made with scaled ingredients");
        fridgeMenu.put(6, "Show total cost of ingredients in fridge");
        fridgeMenu.put(0, StringUtils.coloredText("Back", Color.ANSI_RED));
        return fridgeMenu;
    }

    @Override
    public void onMenuOptionSelected(int menuOption) {
        switch (menuOption) {
            case 1 -> showFridgeContent();
            case 2 -> addIngredients();
            case 3 -> removeIngredient();
            case 4 -> showWhatCanBeMade(4);
            case 5 -> showWhatCanBeMade(5);
            case 6 -> showTotalFridgeCost();
            case 0 -> new KitchenMenu().showMenu();
        }
    }

    private void showTotalFridgeCost() {
        if (Fridge.getInstance().getFridgeItems().isEmpty()) {
            System.out.println(StringUtils.coloredText("Nothing, fridge is empty!", Color.ANSI_RED));
        } else {
            double totalFridgeIngredientCost = Fridge.getInstance().getTotalIngredientPrice();
            System.out.println(StringUtils.coloredText("Total price for ingredients in fridge: " + totalFridgeIngredientCost, Color.ANSI_CYAN));
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }

    private void showWhatCanBeMade(int option) {
        if (Fridge.getInstance().getFridgeItems().isEmpty()) {
            System.out.println(StringUtils.coloredText("Nothing, fridge is empty!", Color.ANSI_RED));
        } else {
            var allRecipes = RecipeBook.getInstance().getAllRecipes();
            ArrayList<Recipe> recipesThatCanBeMade = new ArrayList<>();
            int percent = 0;
            if (option == 5) {
                System.out.println(StringUtils.coloredText("Enter scale in %", Color.ANSI_CYAN));
                percent = new Scanner(System.in).nextInt();
            }
            int finalPercent = percent;
            allRecipes.values().forEach(recipe -> {
                if (compareFridgeAndRecipeIngredientsWithScale(recipe, finalPercent)) {
                    recipesThatCanBeMade.add(recipe);
                }
            });
            if (recipesThatCanBeMade.isEmpty()) {
                System.out.println(StringUtils.coloredText("Sorry, nothing can be made with items in the fridge..", Color.ANSI_RED));
            } else {
                recipesThatCanBeMade.forEach(System.out::println);
            }
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }

    private boolean compareFridgeAndRecipeIngredientsWithScale(Recipe recipe, int scale) {
        boolean canBeMade = false;
        for (WeightedIngredient recipeIngredient : recipe.getIngredients()) {
            int numberOfIngredients = recipe.getIngredients().size();
            int numberOfMatchingFridgeIngredients = 0;
            for (WeightedIngredient fridgeIngredient : Fridge.getInstance().getFridgeItems()) {
                if(fridgeIngredient.getId() == recipeIngredient.getId()) {
                    if(fridgeIngredient.getWeight() + (fridgeIngredient.getWeight()*(scale/100.0)) >= recipeIngredient.getWeight()) {
                        numberOfMatchingFridgeIngredients++;
                    }
                }
            }
            if (numberOfIngredients == numberOfMatchingFridgeIngredients) {
                canBeMade = true;
            }
        }
        return canBeMade;
    }

    private void removeIngredient() {
        if (Fridge.getInstance().getFridgeItems().isEmpty()) {
            System.out.println(StringUtils.coloredText("Fridge is empty!", Color.ANSI_RED));
            System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
            new Scanner(System.in).nextLine();
            showMenu();
        } else {
            System.out.println(StringUtils.coloredText("Fridge content:", Color.ANSI_CYAN));
            Fridge.getInstance().getFridgeItems().forEach(System.out::println);
            System.out.println(StringUtils.coloredText("Enter the ID of ingredient you wish to remove from Fridge or '-1' to cancel.", Color.ANSI_BLUE));
            int ingredientID = new Scanner(System.in).nextInt();
            if (ingredientID == -1) {
                showMenu();
                return;
            }
            Ingredient ingredient = IngredientsDB.getInstance().getIngredientById(ingredientID);
            if (ingredient != null) {
                System.out.println(StringUtils.coloredText("How much you wish to remove in " + ingredient.getUnitOfMeasure().toString(), Color.ANSI_BLUE));
                double amount = new Scanner(System.in).nextDouble();
                Fridge.getInstance().removeFridgeItem(ingredient.getId(), amount);
                System.out.println(StringUtils.coloredText(amount + ingredient.getUnitOfMeasure().toString() +
                        " of " + ingredient.getName() + " removed from fridge!", Color.ANSI_RED));
                System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
                new Scanner(System.in).nextLine();
                showMenu();
            } else {
                System.out.println(StringUtils.coloredText("Invalid ingredient ID!", Color.ANSI_RED));
                System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
                new Scanner(System.in).nextLine();
                showMenu();
            }
        }
    }

    private void addIngredients() {
        for (WeightedIngredient ingredient: IngredientsDB.getInstance().getAllIngredients().values()) {
            System.out.println(ingredient);
        }
        System.out.println(StringUtils.coloredText("Enter the ID of ingredient you wish to add into Fridge or '-1' to cancel.", Color.ANSI_BLUE));
        int ingredientID = new Scanner(System.in).nextInt();
        if (ingredientID == -1) {
            showMenu();
            return;
        }
        WeightedIngredient ingredient = new WeightedIngredient(IngredientsDB.getInstance().getIngredientById(ingredientID));
        if (ingredient != null) {
            System.out.println(StringUtils.coloredText("Enter amount in " + ingredient.getUnitOfMeasure().toString(), Color.ANSI_BLUE));
            double amount = new Scanner(System.in).nextDouble();
            ingredient.setWeight(amount);
            Fridge.getInstance().putIngredientInFridge(ingredient);
            System.out.println(StringUtils.coloredText(amount + ingredient.getUnitOfMeasure().toString()
                    + " " + ingredient.getName() + " added into the fridge!", Color.ANSI_GREEN));
            showFridgeContent();
        } else {
            System.out.println(StringUtils.coloredText("Invalid ingredient ID!", Color.ANSI_RED));
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }

    private void showFridgeContent() {
        if (Fridge.getInstance().getFridgeItems().isEmpty()) {
            System.out.println(StringUtils.coloredText("Fridge is empty!", Color.ANSI_RED));
        } else {
            System.out.println(StringUtils.coloredText("Fridge content:", Color.ANSI_CYAN));
            var items = Fridge.getInstance().getFridgeItems();
            Fridge.getInstance().getFridgeItems().forEach(System.out::println);
        }
        System.out.println(StringUtils.coloredText("Press enter to continue", Color.ANSI_GREEN));
        new Scanner(System.in).nextLine();
        showMenu();
    }
}
