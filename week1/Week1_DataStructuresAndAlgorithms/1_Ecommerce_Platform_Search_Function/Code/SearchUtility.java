import java.util.Arrays;
import java.util.Comparator;


public class SearchUtility {

   
    public static Product findProductByIdLinear(Product[] allProducts, int searchId) {
        for (Product product : allProducts) {
            if (product.getId() == searchId) {
                return product; // found
            }
        }
        return null; 
    }


    public static Product findProductByIdBinary(Product[] allProducts, int searchId) {
        
        Arrays.sort(allProducts, Comparator.comparingInt(Product::getId));

        int start = 0;
        int end = allProducts.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            int currentId = allProducts[middle].getId();

            if (currentId == searchId) {
                return allProducts[middle];
            } else if (currentId < searchId) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return null; 
    }
}
