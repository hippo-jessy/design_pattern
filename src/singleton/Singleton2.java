package singleton;

/**
 * Created by hippo on 3/13/17.
 *
 * This is a lazy initialized and non-thread safe implementation of singleton design pattern.
 */

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){};

    public Singleton2 getInstance(){
        if(instance!=null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
