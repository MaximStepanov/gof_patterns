package ma.stepanov.templatemethod.processors;

import ma.stepanov.templatemethod.bean.Order;

public class OrderProcessorForForeigners extends OrderProcessor {

    String foreignID;

    public OrderProcessorForForeigners(String userName, String password, String foreignID) {
        this.userName = userName;
        this.password = password;
        this.foreignID = foreignID;
    }

    private Order createOrder() {
        Order order = new Order("100045", "Some Special Thing", "100");
        order.deliveryCost = "30";
        return order;
    }

    @Override
    boolean verification() {
        System.out.println("Logging In... ");
        System.out.println("Name: " + this.userName);
        System.out.println("Password: " + this.password);
        System.out.println("Our Foreign ID: " + this.foreignID);
        System.out.println("Verification Done");
        return true;
    }

    void processPayment() {
        String paymentMethod = "Online Payment";
        System.out.println(paymentMethod);
    }

    @Override
    void deliver() {
        System.out.println("Deliver " + order.productName + ", ID " + order.orderID + "\n" +
                "to " + userName + " with id " + foreignID + " in 10 days.");
    }
}
