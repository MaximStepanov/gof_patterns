package ma.stepanov.observer.subscriber;

public abstract class Subscriber {

    public String name;
    public String age;

    public Subscriber(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public abstract void update(String message);
}
