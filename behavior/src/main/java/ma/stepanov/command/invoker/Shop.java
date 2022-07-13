package ma.stepanov.command.invoker;

import ma.stepanov.command.command.CommandHistory;
import ma.stepanov.command.receiver.Product;
import ma.stepanov.command.command.Command;
import ma.stepanov.command.receiver.Products;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {

    private final CommandHistory history = new CommandHistory();
    private final Map<String, Command> listOfCommands = new HashMap<>();
    private final Products products;

    public Shop(Products products) {
        this.products = products;
    }

    public List<Product> showProducts() {
        return products.getProductList();
    }

    public void register(String name, Command command) {
        listOfCommands.put(name, command);
    }

    public void undo() {
        if (history.isEmpty()) {
            return;
        }

        Command command = history.pop();
        if (command != null) {
            command.cancel();
        }
    }

    public void execute(String commandName, Product product) {
        Command command = listOfCommands.get(commandName);
        command.execute(product);
        history.push(command);
    }
}
