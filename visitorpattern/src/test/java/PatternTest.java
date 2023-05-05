import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import visitor.impl.Parent;
import visitor.impl.Principal;

public class PatternTest {
    private Logger logger = LoggerFactory.getLogger(PatternTest.class);

    /**
     * 观察者模式
     */
    @Test
    public void test3() {
        DataView dataView = new DataView();

        logger.info("\r\n家长视角访问：");
        dataView.show(new Parent());

        logger.info("\r\n校长视角访问：");
        dataView.show(new Principal());
    }
}
