package command.command;

import command.receiver.Product;

public interface Command {

    void execute(Product product);
    void cancel();
}
