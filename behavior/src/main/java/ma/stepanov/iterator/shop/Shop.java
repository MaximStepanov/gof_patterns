package ma.stepanov.iterator.shop;

import ma.stepanov.iterator.bean.Product;
import ma.stepanov.iterator.iterators.StandardStoreIterator;
import ma.stepanov.iterator.iterators.StoreIteratorByType;

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