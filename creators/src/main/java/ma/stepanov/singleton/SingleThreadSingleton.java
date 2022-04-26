package ma.stepanov.singleton;

public class SingleThreadSingleton {

    private static SingleThreadSingleton instance;
    private final String osSystem;

    private SingleThreadSingleton(String osSystem) {
        this.osSystem = osSystem;
    }

    public static SingleThreadSingleton initialize(String osSystem) {
        if (instance == null) {
            instance = new SingleThreadSingleton(osSystem);
        }
        return instance;
    }

    public String getOsSystem() {
        return osSystem;
    }
}
