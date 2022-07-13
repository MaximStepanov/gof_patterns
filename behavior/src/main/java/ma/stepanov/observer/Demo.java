package ma.stepanov.observer;

import ma.stepanov.observer.publisher.OnlineShop;
import ma.stepanov.observer.subscriber.Subscriber;
import ma.stepanov.observer.subscriber.SubscriberJake;
import ma.stepanov.observer.subscriber.SubscriberKate;

public class Demo {
    public static void main(String[] args) {
        OnlineShop shop = new OnlineShop();

        Subscriber jake = new SubscriberJake("Jake", "22");
        Subscriber kate = new SubscriberKate("Kate", "19");

        shop.subscribe(jake);
        shop.subscribe(kate);

        shop.addNewProductToTheShop();

        shop.unsubscribe(kate);

        shop.waitingList();
    }
}
