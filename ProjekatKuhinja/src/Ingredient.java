import java.util.ArrayList;
import java.util.List;

public abstract class Ingredient implements Priceable {

    private int id;
    private String name;


    public void setName(String name) {
        this.name = name;
    }
}
