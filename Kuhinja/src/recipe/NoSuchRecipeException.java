package recipe;

public class NoSuchRecipeException extends Exception {
    public NoSuchRecipeException(String message) {
        super(message);
    }
}
