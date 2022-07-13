package ma.stepanov.templatemethod.processors;

import ma.stepanov.templatemethod.bean.Order;

public abstract class OrderProcessor {

    String userName;
    String password;
    Order order;

    OrderProcessor() {}

    public final String orderGuitar() {
        order = createOrder();
        if (verification()) {
            processPayment();
            deliver();
        } else {
            return "NOT OK";
        }
        return "OK";
    }

    private Order createOrder() {
        return new Order("100045", "Some Special Thing", "100");
    }

    abstract boolean verification();

    void processPayment() {
        String paymentMethod = "Pay when deliver";
        System.out.println(paymentMethod);
    }

    abstract void deliver();
}
