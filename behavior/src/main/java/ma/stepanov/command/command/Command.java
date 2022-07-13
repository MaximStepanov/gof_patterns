package ma.stepanov.command.command;

import ma.stepanov.command.receiver.Product;

public interface Command {

    void execute(Product product);
    void cancel();
}
