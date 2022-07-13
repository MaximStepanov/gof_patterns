package ma.stepanov.command.command;

import ma.stepanov.command.receiver.Product;
import ma.stepanov.command.receiver.Products;

public class RemoveProductCommand implements Command {

    private final Products products;
    private Product product;

    public RemoveProductCommand(Products products) {
        this.products = products;
    }

    @Override
    public void execute(Product product) {
        products.remove(product);
        this.product = product;
    }

    @Override
    public void cancel() {
        products.add(product);
    }
}
