package ma.stepanov.templatemethod.processors;

public class OrderProcessorForCitizens extends OrderProcessor {

    public OrderProcessorForCitizens(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean verification() {
        System.out.println("Logging In... ");
        System.out.println("Name: " + this.userName);
        System.out.println("Password: " + this.password);
        System.out.println("Verification Done");
        return true;
    }


    @Override
    void deliver() {
        System.out.println("Deliver " + order.productName + ", ID " + order.orderID +
                "\nto " + userName + " in 2 days.");
    }
}
