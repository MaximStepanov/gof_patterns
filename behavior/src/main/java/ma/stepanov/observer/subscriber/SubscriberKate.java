package ma.stepanov.observer.subscriber;

public class SubscriberKate extends Subscriber {

    public SubscriberKate(String name, String age) {
        super(name, age);
    }

    @Override
    public void update(String message) {
        System.out.println("KATE received message: " + message);
    }
}
