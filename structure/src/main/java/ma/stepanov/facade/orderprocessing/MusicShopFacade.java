package ma.stepanov.facade.orderprocessing;

import ma.stepanov.facade.orderprocessing.internal.Delivery;
import ma.stepanov.facade.orderprocessing.internal.Orderer;
import ma.stepanov.facade.orderprocessing.internal.ShopFactory;
import ma.stepanov.facade.orderprocessing.internal.StoreReceiver;
import ma.stepanov.facade.orderprocessing.internal.bean.Customer;
import ma.stepanov.facade.orderprocessing.internal.bean.InstrumentType;
import ma.stepanov.facade.orderprocessing.internal.bean.Product;
import ma.stepanov.facade.orderprocessing.internal.shop.Shop;

public class MusicShopFacade {

    public static MusicShopFacade INSTANCE;

    private MusicShopFacade() {
    }

    public static MusicShopFacade initialize() {
        if (INSTANCE == null) {
            INSTANCE = new MusicShopFacade();
        }
        return INSTANCE;
    }

    public void order(InstrumentType type, String shopName, Customer customer) throws Exception {
        System.out.println("============================================");
        System.out.println("=========Welcome to our Online shop!========");
        Shop shop = new ShopFactory().getShop(shopName);
        StoreReceiver storeReceiver = shop.storeReceiver;
        if (!storeReceiver.checkAbsence(type)) {
            throw new IllegalArgumentException("there are no such product with type " + type.toString());
        }
        Product product = storeReceiver.getFromStoreByType(type);
        Orderer orderer = new Orderer(storeReceiver);
        if (orderer.removeFromProductList(product)) {
            System.out.println(product.name + " successfully removed from store");
        } else {
            throw new Exception("Smthng went wrong, there are no any product in store already");
        }
        orderer.processPayment();
        orderer.sendCheck(customer);
        new Delivery().deliverToCustomer(customer);
    }
}
