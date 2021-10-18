import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import store.ICommodity;

import java.util.HashMap;
import java.util.Map;

public class PatternTest {
    private Logger logger = LoggerFactory.getLogger(PatternTest.class);





    /**
     * 工厂方法模式： 各种类型奖品发放
     *  * 在营销场景中经常会有某个⽤户做了⼀些操作；打卡、分享、留⾔、邀请注册等等，进⾏返利积分，最
     *  * 后通过积分在兑换商品，从⽽促活和拉新。
     *  * 那么在这⾥我们模拟积分兑换中的发放多种类型商品，假如现在我们有如下三种类型的商品接⼝；
     *  * 三个接⼝返回类型不同，有对象类型、布尔类型、还有⼀个空类型。
     *  * ⼊参不同，发放优惠券需要仿᯿、兑换卡需要卡ID、实物商品需要发货位置(对象中含有)。
     *  * 另外可能会随着后续的业务的发展，会新增其他种商品类型。因为你所有的开发需求都是随着业务
     *  * 对市场的拓展⽽带来的。
     *  *
     *  * 如果不考虑任何扩展性，只为了尽快满⾜需求，那么对这么⼏种奖励发放只需使⽤ifelse语句判断
     *  *
     *  * 所有的奖品⽆论是实物、虚拟还是第三⽅，都需要通过我们的程序实现此接⼝进⾏处理，以保证最
     *  * 终⼊参出参的统⼀性。
     *  * 接⼝的⼊参包括； ⽤户ID 、 奖品ID 、 业务ID 以及 扩展字段 ⽤于处理发放实物商品时的收获地
     *  * 址。
     */
    @Test
    public void test_awardToUser() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");

        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", null, null);
    }





}
