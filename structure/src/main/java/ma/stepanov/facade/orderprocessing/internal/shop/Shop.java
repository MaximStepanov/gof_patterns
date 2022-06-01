package ma.stepanov.facade.orderprocessing.internal.shop;

import ma.stepanov.facade.orderprocessing.internal.StoreReceiver;

import java.util.ArrayList;

public abstract class Shop {

    public String name;
    public StoreReceiver storeReceiver;

    public Shop() {
        storeReceiver = new StoreReceiver();
        storeReceiver.products = new ArrayList<>();
    }
}
