package iterator;

import iterator.shop.FrolSoundShop;
import iterator.shop.MusicManShop;
import iterator.shop.Shop;

public class ShopFactory {

    public Shop getShop(String shopName) {
        if (shopName.equals("FrolSound")) {
            return new FrolSoundShop();
        } else {
            return new MusicManShop();
        }
    }
}
