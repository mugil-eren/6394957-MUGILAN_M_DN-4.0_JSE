
public class Product {
    private int id;
    private String name;
    private String category;

    // Constructor to initialize a product
    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    // product information
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Category: " + category;
    }
}
