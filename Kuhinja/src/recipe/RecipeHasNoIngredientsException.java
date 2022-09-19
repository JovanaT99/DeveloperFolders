package recipe;

public class RecipeHasNoIngredientsException extends Exception {
    public RecipeHasNoIngredientsException(String message) {
        super(message);
    }
}
