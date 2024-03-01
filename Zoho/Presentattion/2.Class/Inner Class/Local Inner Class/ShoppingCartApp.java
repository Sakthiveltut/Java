// Outer class representing a shopping cart
class ShoppingCart {
    private String customerName;

    public ShoppingCart(String customerName) {
        this.customerName = customerName;
    }

    // Method to add a product to the shopping cart
    public void addProduct(String productName, double price) {
        System.out.println(customerName + " is adding a product to the shopping cart...");

        // Local inner class representing a product
        class Product {
            private String productName;
            private double productPrice;

            // Constructor for the product
            public Product(String productName, double productPrice) {
                this.productName = productName;
                this.productPrice = productPrice;
            }

            // Method to display details of the product
            public void displayProductDetails() {
                System.out.println("Product Name: " + productName);
                System.out.println("Price: $" + productPrice);
            }
        }

        Product addedProduct = new Product(productName, price);

        addedProduct.displayProductDetails();
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart("Alice");

        myCart.addProduct("Laptop", 999.99);
    }
}
