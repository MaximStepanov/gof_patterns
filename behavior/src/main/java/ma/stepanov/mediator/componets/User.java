package ma.stepanov.mediator.componets;

import ma.stepanov.mediator.chatmediator.Mediator;

public abstract class User {

    Mediator mediator;
    String username;

    public User(Mediator mediator, String username) {
        this.mediator = mediator;
        this.username = username;
    }

    public abstract void send(String message);

    public abstract void notifyAll(String message);
}
