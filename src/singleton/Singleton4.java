package singleton;

/**
 * This is a lazy-initialized and thread-safe(using Double Checked Locking) implementation of Singleton Design Pattern.
 */
public class Singleton4 {
    private static volatile Singleton4 instance;
    private Singleton4(){}

    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized(Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
