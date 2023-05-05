public class SingletonByVolatile {
    private volatile static SingletonByVolatile singleton;
    private SingletonByVolatile (){}
    public static SingletonByVolatile getSingleton() {
        if (singleton == null) {
            synchronized (SingletonByVolatile.class) {
                // 注意此处还得有次判空~
                if (singleton == null) {
                    singleton = new SingletonByVolatile();
                }
            }
        }
        return singleton;
    }
}
