import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatternTest {
    private Logger logger = LoggerFactory.getLogger(PatternTest.class);

    /**
     * 模板方法
     */
    @Test
    public void test() {
        new DrawMoney().process();
        new ManageMoney().process();
    }

}
