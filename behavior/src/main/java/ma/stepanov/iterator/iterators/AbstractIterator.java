package ma.stepanov.iterator.iterators;

import ma.stepanov.iterator.bean.Product;

import java.util.List;

public abstract class AbstractIterator {

    public List<Product> products;
    public Product foundProduct = null;
}
