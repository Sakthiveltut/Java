import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class CSV1 {
    private static final String CSV_FILE = "products.csv";

    public static void writeProductsToCSV(List<Product> products) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(CSV_FILE))) {
            for (Product product : products) {
                writer.writeNext(new String[]{String.valueOf(product.getId()), product.getName(), String.valueOf(product.getPrice())});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readProductsFromCSV() {
        List<Product> products = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(CSV_FILE))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                int id = Integer.parseInt(record[0]);
                String name = record[1];
                double price = Double.parseDouble(record[2]);
                products.add(new Product(id, name, price));
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Product A", 10.0));
        products.add(new Product(2, "Product B", 20.0));

        writeProductsToCSV(products);
		readProductsFromCSV();
        List<Product> readProducts = readProductsFromCSV();

        for (Product product : readProducts) {
            System.out.println(product);
        }
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
