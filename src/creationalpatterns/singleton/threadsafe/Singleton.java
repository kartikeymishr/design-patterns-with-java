package creationalpatterns.singleton.threadsafe;

/**
 * Multiple threads can call the creation method simultaneously and get
 * several instances of the Singleton class. To fix this problem you have to synchronize
 * threads during first creation of the Singleton object
 */

public class Singleton {
    // The field class must be declared volatile so that
    // double check lock would work correctly
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL)
        // It exists to prevent race condition between multiple threads that may
        // attempt to get creationalpatterns.singleton instance at the same time, creating separate
        // instances as a result

        // It may seem that having the 'result' variable here is completely pointless.
        // There is, however, a very important caveat when implementing DCL in Java,
        // which is solved by introducing this local variable.
        Singleton result = instance;
        if (result != null) {
            return result;
        }

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
