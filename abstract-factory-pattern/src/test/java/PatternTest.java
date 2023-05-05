import adapter.impl.EGMCacheAdapter;
import adapter.impl.IIRCacheAdapter;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.chrisxyq.design.service.CacheService;
import com.chrisxyq.design.service.impl.CacheServiceImpl;
import util.JDKProxy;

public class PatternTest {
    private Logger logger = LoggerFactory.getLogger(PatternTest.class);

    /**
     * 抽象工厂： 多套Redis缓存集群升级
     * 测试的代码中通过传⼊不同的集群类型，就可以调⽤不同的集群下的⽅
     * 法。
     * ICacheAdapter和CacheService不重复吗
     */
    @Test
    public void test_CacheService() throws Exception {

        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "小傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "小傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }

}
