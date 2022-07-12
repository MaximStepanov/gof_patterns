package iterator.iterators;

import iterator.bean.InstrumentType;
import iterator.bean.Product;

import java.util.List;

public abstract class AbstractIterator {

    public List<Product> products;
    public Product foundProduct = null;
}
