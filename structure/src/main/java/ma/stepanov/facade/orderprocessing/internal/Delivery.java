package ma.stepanov.facade.orderprocessing.internal;

import ma.stepanov.facade.orderprocessing.internal.bean.Customer;

public class Delivery {

    public void deliverToCustomer(Customer customer) {
        System.out.println("Product sent to customer with address " + customer.address);
    }
}
