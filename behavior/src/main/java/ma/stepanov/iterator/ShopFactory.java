package ma.stepanov.iterator;

import ma.stepanov.iterator.shop.FrolSoundShop;
import ma.stepanov.iterator.shop.MusicManShop;
import ma.stepanov.iterator.shop.Shop;

public class ShopFactory {

    public Shop getShop(String shopName) {
        if (shopName.equals("FrolSound")) {
            return new FrolSoundShop();
        } else {
            return new MusicManShop();
        }
    }
}
