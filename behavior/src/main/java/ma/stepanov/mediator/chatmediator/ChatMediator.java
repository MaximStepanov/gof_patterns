package ma.stepanov.mediator.chatmediator;

import ma.stepanov.mediator.componets.User;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    List<User> users;

    public ChatMediator() {
        users = new ArrayList<>();
    }

    @Override
    public void send(String message, User user) {
        for (User u : this.users) {
            if (u != user) {
                u.notifyAll(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
