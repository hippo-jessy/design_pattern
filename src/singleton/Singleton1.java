package singleton;

/**
 * Created by hippo on 3/13/17.
 * <p>
 * This is a non-lazy initialized and thread-safe implementation of Singleton design pattern.
 */
public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
