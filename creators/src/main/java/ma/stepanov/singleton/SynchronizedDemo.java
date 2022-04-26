package ma.stepanov.singleton;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());
        firstThread.start();
        secondThread.start();
    }

    private static class FirstThread implements Runnable {
        @Override
        public void run() {
            System.out.println("First thread:");
            SynchronizedSingleton singleton = SynchronizedSingleton.initialize("windows");
            System.out.println("FirstThread os is " + singleton.getOsSystem());
        }
    }

    private static class SecondThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Second thread:");
            SynchronizedSingleton singleton = SynchronizedSingleton.initialize("linux");
            System.out.println("SecondThread os is " + singleton.getOsSystem());
        }
    }
}
