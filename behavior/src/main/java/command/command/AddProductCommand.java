package command.command;

import command.receiver.Product;
import command.receiver.Products;


public class AddProductCommand implements Command {

    private final Products products;
    private Product product;

    public AddProductCommand(Products products) {
        this.products = products;
    }

    @Override
    public void execute(Product product) {
        products.add(product);
        this.product = product;
    }

    @Override
    public void cancel() {
        products.remove(product);
    }
}
