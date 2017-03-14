package singleton;

/**
 * Created by hippo on 3/13/17.
 * <p>
 * This is a lazy-initialized and thread-safe(using synchronized) implementation of Singleton design pattern.
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
    }

    public synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
