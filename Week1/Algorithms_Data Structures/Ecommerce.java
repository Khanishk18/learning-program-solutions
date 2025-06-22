import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<String> products = Arrays.asList(
                "Red T-Shirt", "Blue Jeans", "Black Shoes", "White Hat", "Green Socks");

        String keyword = "sh";

        List<String> result = searchProducts(products, keyword);

        for (String product : result) {
            System.out.println(product);
        }
    }

    public static List<String> searchProducts(List<String> products, String keyword) {
        List<String> result = new ArrayList<>();
        for (String product : products) {
            if (product.toLowerCase().contains(keyword.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}
