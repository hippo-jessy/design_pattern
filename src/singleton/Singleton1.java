package singleton;

/**
 * Created by hippo on 3/13/17.
 *
 * This is a non-lazy and thread-safe implementation of singleton design pattern.
 */
public class Singleton1 {
    private static final Singleton1 singleton = new Singleton1();
    private Singleton1(){};

    public static Singleton1 getInstance(){
        return singleton;
    }
}
