package ma.stepanov.iterator.shop;

import ma.stepanov.iterator.bean.InstrumentType;
import ma.stepanov.iterator.bean.Product;
import ma.stepanov.iterator.iterators.StandardStoreIterator;
import ma.stepanov.iterator.iterators.StoreIteratorByType;

public class FrolSoundShop extends Shop {

    public FrolSoundShop() {
        super();
        name = "FrolSound";
        Product p1 = new Product();
        p1.name = "frol sound drums";
        p1.instrumentType = InstrumentType.DRUMS;
        p1.mark = "PERL";
        products.add(p1);
    }

    public StoreIteratorByType createIteratorByType() {
        return new StoreIteratorByType(this.products);
    }

    @Override
    public StandardStoreIterator createStandardIterator() {
        return new StandardStoreIterator(this.products);
    }
}
