import java.util.HashMap;
import java.util.Map;

/**
 * 函数式策略模式
 * 在业务不稳定的初期先使用函数式设计模式，利用它的便捷性快速演进，等到业务逐渐成熟，模式确定之后，再改成封装性更好的面向对象设计模式。
 */
class AService {
    private static Map<String, Runnable> strategyMap;

    static {
        strategyMap = new HashMap<>();
        strategyMap.put("a", AService::aStrategy);
        strategyMap.put("b", AService::bStrategy);
    }

    public void doSomething(String strategy) {
        strategyMap.get(strategy).run();
    }

    private static void aStrategy() {
        //...
    }

    private static void bStrategy() {
        //...
    }
}
