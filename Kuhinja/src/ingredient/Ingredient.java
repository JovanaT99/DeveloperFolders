package ingredient;

public abstract class Ingredient implements Priceable {

    private int id;
    private String name;
    private double price;

    private UnitOfMeasure unitOfMeasure;

    public Ingredient(String name, UnitOfMeasure unitOfMeasure) {
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.price = getPrice();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }
}
