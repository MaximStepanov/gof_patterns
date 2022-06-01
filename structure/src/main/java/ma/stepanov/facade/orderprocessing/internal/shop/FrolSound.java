package ma.stepanov.facade.orderprocessing.internal.shop;

import ma.stepanov.facade.orderprocessing.internal.bean.InstrumentType;
import ma.stepanov.facade.orderprocessing.internal.bean.Product;

public class FrolSound extends Shop {

    public FrolSound() {
        super();
        name = "FrolSound";
        Product p1 = new Product();
        p1.name = "frol sound drums";
        p1.instrumentType = InstrumentType.DRUMS;
        p1.mark = "PERL";
        storeReceiver.products.add(p1);
    }
}
