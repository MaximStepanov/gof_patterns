package ma.stepanov.observer.subscriber;

public class SubscriberJake extends Subscriber {


    public SubscriberJake(String name, String age) {
        super(name, age);
    }

    @Override
    public void update(String message) {
        System.out.println("JAKE received message: " + message);
    }
}
