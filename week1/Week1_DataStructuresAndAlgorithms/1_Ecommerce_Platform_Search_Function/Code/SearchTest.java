
public class SearchTest {
    public static void main(String[] args) {
 
        Product[] products = {
            new Product(101, "T-Shirt", "Clothing"),
            new Product(102, "Sneakers", "Footwear"),
            new Product(103, "Laptop", "Electronics"),
            new Product(104, "Phone", "Electronics"),
            new Product(105, "Watch", "Accessories")
        };

        int searchForId = 103;

        Product resultLinear = SearchUtility.findProductByIdLinear(products, searchForId);
        System.out.println("Linear Search Result:");
        System.out.println(resultLinear != null ? resultLinear : "Product not found.");

      
        Product resultBinary = SearchUtility.findProductByIdBinary(products, searchForId);
        System.out.println("\nBinary Search Result:");
        System.out.println(resultBinary != null ? resultBinary : "Product not found.");
    }
}
