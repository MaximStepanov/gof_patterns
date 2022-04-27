package ma.stepanov.singleton;

public class SynchronizedSingleton {

    private static volatile SynchronizedSingleton instance;
    private final String osSystem;

    private SynchronizedSingleton(String osSystem) {
        this.osSystem = osSystem;
    }

    public static synchronized SynchronizedSingleton initialize(String osSystem) {
        if (instance == null) {
            instance = new SynchronizedSingleton(osSystem);
        }
        return instance;
    }

    public String getOsSystem() {
        return osSystem;
    }
}
