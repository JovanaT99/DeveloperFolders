public interface Priceable {

    double getPrice();
    default void setPrice(double price) {
    }

}
