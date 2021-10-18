import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatternTest {
    private Logger logger = LoggerFactory.getLogger(PatternTest.class);


    /**
     * 享元模式：以着᯿学习享元⼯⼚的设计，在⼀些有⼤量᯿复对象可复⽤的场景下，
     * 使⽤此场景在服务端减少接⼝的调⽤
     */
    @Test
    public void test7() throws InterruptedException {
        ActivityController activityController = new ActivityController();
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }


}
