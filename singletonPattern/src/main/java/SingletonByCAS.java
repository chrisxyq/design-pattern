import java.util.concurrent.atomic.AtomicReference;

public class SingletonByCAS {
    private static final AtomicReference<SingletonByCAS> INSTANCE = new AtomicReference<SingletonByCAS>();

    private static SingletonByCAS instance;

    private SingletonByCAS() {
    }

    public static final SingletonByCAS getInstance() {
        for (; ; ) {
            SingletonByCAS instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new SingletonByCAS());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(SingletonByCAS.getInstance()); // org.itstack.demo.design.SingletonByCAS@2b193f2d
        System.out.println(SingletonByCAS.getInstance()); // org.itstack.demo.design.SingletonByCAS@2b193f2d
    }
}
