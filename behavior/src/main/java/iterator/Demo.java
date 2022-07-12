package iterator;

import iterator.bean.InstrumentType;
import iterator.bean.Product;
import iterator.iterators.StandardStoreIterator;
import iterator.iterators.StoreIteratorByType;
import iterator.shop.Shop;

import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("First Iterator which is NOT common and standard");
        System.out.println("----------------------------------------------");
        tryIterateByType(InstrumentType.SYNTH, "MusicMan");
        tryIterateByType(InstrumentType.SYNTH, "FrolSound");
        System.out.println("=============================================");
        System.out.println("Second Iterator which is Standard");
        System.out.println("----------------------------------------------");
        tryStandardIterate("MusicMan");
        tryStandardIterate("FrolSound");
        System.out.println("----------------------------------------------");
    }

    public static void tryIterateByType(InstrumentType type, String shopName) {
        Shop shop = new ShopFactory().getShop(shopName);
        StoreIteratorByType storeIteratorByType = shop.createIteratorByType();
        if (!storeIteratorByType.checkAbsence(type)) {
            System.out.println("there are no such product with type " + type.toString());
        }
        Product product = storeIteratorByType.getFromStore(type);
        if (product != null) {
            System.out.println(product.name + " in the store");
        } else {
            System.out.println("Product is null");
        }
    }

    public static void tryStandardIterate(String shopName) {
        Shop shop = new ShopFactory().getShop(shopName);
        StandardStoreIterator standardStoreIterator = shop.createStandardIterator();
        Iterator<Product> iterator = standardStoreIterator.iterator();
        if (iterator.hasNext()) {
            System.out.println("Good! Let's iterate " + shopName + " products!");
        }
        for (Product product : standardStoreIterator) {
            System.out.println("Product " + product.name + ", mark " + product.mark + ", " + product.instrumentType);
        }
    }
}
