package ma.stepanov.facade.orderprocessing.internal.shop;

import ma.stepanov.facade.orderprocessing.internal.bean.InstrumentType;
import ma.stepanov.facade.orderprocessing.internal.bean.Product;

public class MusicMan extends Shop {

    public MusicMan() {
        super();
        name = "MusicMan";
        Product p1 = new Product();
        p1.name = "music man guitar";
        p1.instrumentType = InstrumentType.GUITAR;
        p1.mark = "Yamaha";
        storeReceiver.products.add(p1);
        Product p2 = new Product();
        p2.name = "music man synth";
        p2.instrumentType = InstrumentType.SYNTH;
        p2.mark = "Casio";
        storeReceiver.products.add(p2);
    }
}
