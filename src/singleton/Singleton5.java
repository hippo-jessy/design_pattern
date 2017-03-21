package singleton;

/**
 * This is a lazy-initialized and thread-safe implementation of Singleton design pattern taking use of inner class.
 */
public class Singleton5 {
    static class InnerSingleton {
        public static Singleton5 instance = new Singleton5();
    }

    private Singleton5() {
    }

    public Singleton5 getInstance() {
        return InnerSingleton.instance;
    }
}
