package Stream.Stream.DC.DC_T_5_FP1;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return String.format("%s - Price: %.2f€ - Quantity: %d",
                name, price, quantity);
    }
}
