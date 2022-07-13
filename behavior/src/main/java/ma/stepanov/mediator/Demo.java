package ma.stepanov.mediator;

import ma.stepanov.mediator.chatmediator.ChatMediator;
import ma.stepanov.mediator.chatmediator.Mediator;
import ma.stepanov.mediator.componets.ConcreteUser;
import ma.stepanov.mediator.componets.User;

public class Demo {

    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        User maryJane = new ConcreteUser(mediator, "Mary Jane");
        User peterParker = new ConcreteUser(mediator, "Peter Parker");
        User doc = new ConcreteUser(mediator, "Doctor Octopus");
        User may = new ConcreteUser(mediator, "May");
        User ironMan = new ConcreteUser(mediator, "Tony Stark");

        mediator.addUser(maryJane);
        mediator.addUser(peterParker);
        mediator.addUser(doc);
        mediator.addUser(may);
        mediator.addUser(ironMan);

        peterParker.send("Hi, I'm Peter Parker!");
    }
}
