package ingredient;

public enum UnitOfMeasure {

    GRAMS("g"),
    KILOGRAMS("kg"),
    MILLILITRES("ml"),
    LITRES("L"),
    PIECE("kom");

    private final String unit;
    UnitOfMeasure(String unit){
        this.unit = unit;
    }

    @Override
    public String toString() {
        return unit;
    }
}
