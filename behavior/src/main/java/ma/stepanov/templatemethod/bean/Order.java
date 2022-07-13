package ma.stepanov.templatemethod.bean;

public class Order {

    public String orderID;
    public String productName;
    public String cost;
    public String deliveryCost;

    public Order(String orderID, String productName, String cost) {
        this.orderID = orderID;
        this.productName = productName;
        this.cost = cost;
    }
}
