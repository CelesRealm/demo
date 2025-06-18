
import java.util.*;

public class SearchFunction {
    public static List<String> search(List<String> products, String keyword) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> products = Arrays.asList("Shoes", "Shirts", "Pants", "Socks", "Hat");
        List<String> found = search(products, "sh");

        System.out.println("Search Results:");
        for (String product : found) {
            System.out.println(product);
        }
    }
}
