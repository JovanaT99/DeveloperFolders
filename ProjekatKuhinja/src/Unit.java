public enum Unit {

    GRAMS,
    KILOGRAMS,
    MILLILITERS,
    LITERS,
    PEACE;


    @Override
    public String toString() {
        return switch (this) {
            case GRAMS -> "grama";
            case LITERS -> "litara";
            case KILOGRAMS -> "kilograma";
            case MILLILITERS -> "mililitara";
            case PEACE -> "peace";
        };
    }
}
