package ma.stepanov.observer.publisher;

import ma.stepanov.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {

    List<Subscriber> subscribers;

    public OnlineShop() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.name + " has been subscribed to shop.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.name + " has been UNsubscribed from shop.");
    }

    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public void addNewProductToTheShop() {
        notifySubscribers("New product, hey!");
    }

    public void waitingList() {
        notifySubscribers("Product from your waiting list appeared.");
    }
}
