package ma.stepanov.facade.orderprocessing.internal;

import ma.stepanov.facade.orderprocessing.internal.bean.Customer;
import ma.stepanov.facade.orderprocessing.internal.bean.Product;

public class Orderer {

    public final StoreReceiver storeReceiver;

    public Orderer(StoreReceiver storeReceiver) {
        this.storeReceiver = storeReceiver;
    }

    public boolean removeFromProductList(Product product) {
        return this.storeReceiver.products.remove(product);
    }

    public void processPayment() {
        System.out.println("Purchase processing....");
    }

    public void sendCheck(Customer customer) {
        System.out.println("Check sent to " + customer.email);
    }
}
