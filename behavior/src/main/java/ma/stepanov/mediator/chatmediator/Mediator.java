package ma.stepanov.mediator.chatmediator;

import ma.stepanov.mediator.componets.User;

public interface Mediator {

    void send(String message, User user);

    void addUser(User user);
}
