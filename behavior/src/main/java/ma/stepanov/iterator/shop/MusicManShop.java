package ma.stepanov.iterator.shop;

import ma.stepanov.iterator.bean.InstrumentType;
import ma.stepanov.iterator.bean.Product;
import ma.stepanov.iterator.iterators.StandardStoreIterator;
import ma.stepanov.iterator.iterators.StoreIteratorByType;

public class MusicManShop  extends Shop {

    public MusicManShop() {
        super();
        name = "MusicMan";
        Product p1 = new Product();
        p1.name = "music man guitar";
        p1.instrumentType = InstrumentType.GUITAR;
        p1.mark = "Yamaha";
        products.add(p1);
        Product p2 = new Product();
        p2.name = "music man synth";
        p2.instrumentType = InstrumentType.SYNTH;
        p2.mark = "Casio";
        products.add(p2);
    }

    public StoreIteratorByType createIteratorByType() {
        return new StoreIteratorByType(this.products);
    }

    @Override
    public StandardStoreIterator createStandardIterator() {
        return new StandardStoreIterator(this.products);
    }
}
