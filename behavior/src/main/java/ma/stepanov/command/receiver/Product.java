package ma.stepanov.command.receiver;

public class Product {

    public String name;
    public String cost;

    public Product(String name, String cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }
}
