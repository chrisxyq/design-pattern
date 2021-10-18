/**
 * 主要是因为JVM虚拟机可以保证多线程并发访问的正确性，也就是⼀个类的构造⽅法在多线程环
 * 境下可以被正确的加载
 */
public class SingletonByHolder {
    // 静态内部类
    private static class SingletonHolder {
        private static final SingletonByHolder INSTANCE = new SingletonByHolder();
    }
    private SingletonByHolder (){}

    public static final SingletonByHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
