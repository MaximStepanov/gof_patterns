package ma.stepanov.singleton;

public class SingleThreadDemo {

    public static void main(String[] args) {
        System.out.println("First init:");
        SingleThreadSingleton singleton = SingleThreadSingleton.initialize("macOS");
        System.out.println("After 1st os is " + singleton.getOsSystem());
        System.out.println();
        System.out.println("Second init:");
        SingleThreadSingleton singleton2 = SingleThreadSingleton.initialize("windows");
        System.out.println("After 2st os is " + singleton2.getOsSystem());
    }
}
