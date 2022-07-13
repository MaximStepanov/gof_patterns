package ma.stepanov.mediator.componets;

import ma.stepanov.mediator.chatmediator.Mediator;

public class ConcreteUser extends User {

    public ConcreteUser(Mediator mediator, String username) {
        super(mediator, username);
    }

    @Override
    public void send(String message) {
        System.out.println(this.username + " sending message '" + message + "'...");
        mediator.send(message, this);
    }

    @Override
    public void notifyAll(String message) {
        System.out.println(username + " gets message: " + message);
    }
}
