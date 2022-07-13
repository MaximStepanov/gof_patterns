package ma.stepanov.command;

import ma.stepanov.command.invoker.Shop;
import ma.stepanov.command.command.AddProductCommand;
import ma.stepanov.command.command.Command;
import ma.stepanov.command.command.RemoveProductCommand;
import ma.stepanov.command.receiver.Product;
import ma.stepanov.command.receiver.Products;

public class Demo {

    public static void main(String[] args) {
        // init 3 products
        Product prod1 = new Product("prod1", "123");
        Product prod2 = new Product("prod2", "222");
        Product prod3 = new Product("prod3", "321");

        Products products = new Products();
        // make 3 add commands(prod1, prod2, prod3), 1 remove(prod2)
        Command addCommand = new AddProductCommand(products);
        Command removeCommand = new RemoveProductCommand(products);

        // init shop
        Shop shop = new Shop(products);
        System.out.println("List Of Products BEFORE commands");
        System.out.println(shop.showProducts());

        // register all commands
        shop.register("add", addCommand);
        shop.register("rem", removeCommand);

        // exec 3 add commands
        shop.execute("add", prod1);
        shop.execute("add", prod2);
        shop.execute("add", prod3);
        System.out.println("List Of Products AFTER add commands");
        System.out.println(shop.showProducts());

        // undo add ma.stepanov.command
        shop.undo();
        System.out.println("List Of Products AFTER undo add");
        System.out.println(shop.showProducts());

        // exec remove
        shop.execute("rem", prod1);
        System.out.println("List Of Products AFTER remove commands");
        System.out.println(shop.showProducts());

        // undo remove ma.stepanov.command
        shop.undo();
        System.out.println("List Of Products AFTER undo remove");
        System.out.println(shop.showProducts());
    }
}
