package ma.stepanov.facade.orderprocessing.internal;

import ma.stepanov.facade.orderprocessing.internal.bean.InstrumentType;
import ma.stepanov.facade.orderprocessing.internal.bean.Product;

import java.util.List;

// типа итератор получается
public class StoreReceiver {

    public List<Product> products;
    public Product foundProduct = null;

    public boolean checkAbsence(InstrumentType type) {
        if (foundProduct != null) {
            return true;
        }
        for (Product p : products) {
            if (p.instrumentType == type) {
                foundProduct = p;
                return true;
            }
        }
        return false;
    }

    public Product getFromStoreByType(InstrumentType type) throws IllegalArgumentException {
        if (foundProduct != null) {
            Product temp = foundProduct;
            foundProduct = null;
            System.out.println("Necessary product has been found!");
            return temp;
        }
        Product product1 = products.stream().filter(product -> product.instrumentType == type).findAny()
                .orElse(null);
        if (product1 != null) {
            return product1;
        } else {
            throw new IllegalArgumentException("there are no such product with type " + type.toString());
        }
    }
}
