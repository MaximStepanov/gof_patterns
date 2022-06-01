package ma.stepanov.facade.orderprocessing.internal;

import ma.stepanov.facade.orderprocessing.internal.shop.FrolSound;
import ma.stepanov.facade.orderprocessing.internal.shop.MusicMan;
import ma.stepanov.facade.orderprocessing.internal.shop.Shop;

public class ShopFactory {

    public Shop getShop(String shopName) {
        if (shopName.equals("FrolSound")) {
            return new FrolSound();
        } else {
            return new MusicMan();
        }
    }
}
