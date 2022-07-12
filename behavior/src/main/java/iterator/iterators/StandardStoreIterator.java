package iterator.iterators;

import iterator.bean.Product;

import java.util.Iterator;
import java.util.List;

public class StandardStoreIterator extends AbstractIterator implements Iterable<Product> {

    public StandardStoreIterator(List<Product> products) {
        this.products = products;
    }

    @Override
    public Iterator<Product> iterator() {
        return new ListIterator(this.products);
    }

    private class ListIterator implements Iterator<Product> {

        private final List<Product> products;
        private int position;

        public ListIterator(List<Product> products) {
            this.products = products;
        }

        @Override
        public boolean hasNext() {
            return position < products.size();
        }

        @Override
        public Product next() {
            Product value = products.get(position);
            position++;
            return value;
        }
    }
}
