package ma.stepanov.facade;

import ma.stepanov.facade.orderprocessing.MusicShopFacade;
import ma.stepanov.facade.orderprocessing.internal.bean.Customer;
import ma.stepanov.facade.orderprocessing.internal.bean.InstrumentType;

public class Demo {

    public static void main(String[] args) {
        MusicShopFacade facade = MusicShopFacade.initialize();
        Customer customer = new Customer();
        customer.name = "Jimmy";
        customer.address = "CA, Los-Angeles, 1th avenue, 45";
        customer.email = "club27@gmail.com";
        try {
            facade.order(InstrumentType.SYNTH, "MusicMan", customer);
        } catch (Exception e) {
            System.out.println("Order Failed : " + e.getMessage());
            e.printStackTrace();
        }
        try {
            facade.order(InstrumentType.GUITAR, "FrolSound", customer);
        } catch (Exception e) {
            System.out.println("Order Failed : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
