package topics;

enum Item {
    LAPTOP("Electronics", 75000.50, "Lenovo"),
    CHAIR("Furniture", 3500.75, "Wood"),
    PEN("Stationery", 20.00, "Parker");

    private final String category;
    private final double price;
    private final String brand;

    // Constructor
    Item(String category, double price, String brand) {
        this.category = category;
        this.price = price;
        this.brand = brand;
    }

    // Getter methods
    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Iterate through all items in the enum
        for (Item item : Item.values()) {
            System.out.println("Item: " + item);
            System.out.println("Category: " + item.getCategory());
            System.out.println("Price: " + item.getPrice());
            System.out.println("Brand: " + item.getBrand());
            System.out.println("-----");
        }
    }
}
