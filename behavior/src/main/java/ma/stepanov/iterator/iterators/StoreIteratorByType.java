package ma.stepanov.iterator.iterators;

import ma.stepanov.iterator.bean.InstrumentType;
import ma.stepanov.iterator.bean.Product;

import java.util.List;

public class StoreIteratorByType extends AbstractIterator {

    public StoreIteratorByType(List<Product> products) {
        this.products = products;
    }

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

    public Product getFromStore(InstrumentType type) {
        if (!checkAbsence(type)) {
            return null;
        }
        if (foundProduct != null) {
            Product temp = foundProduct;
            foundProduct = null;
            System.out.println("Necessary product has been found!");
            return temp;
        }
        return products.stream().filter(product -> product.instrumentType == type).findAny()
                .orElse(null);
    }
}
