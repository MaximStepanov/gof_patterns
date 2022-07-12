package iterator.shop;

import iterator.bean.Product;
import iterator.iterators.StandardStoreIterator;
import iterator.iterators.StoreIteratorByType;

import java.util.ArrayList;
import java.util.List;

public abstract class Shop {

    public String name;
    public List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public abstract StoreIteratorByType createIteratorByType();
    public abstract StandardStoreIterator createStandardIterator();
}