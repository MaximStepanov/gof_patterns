package command.receiver;

import java.util.LinkedList;
import java.util.List;

public class Products {

    private final List<Product> productList = new LinkedList<>();

    public void add(Product product) {
        productList.add(product);
    }

    public void remove(Product product) {
        productList.remove(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
