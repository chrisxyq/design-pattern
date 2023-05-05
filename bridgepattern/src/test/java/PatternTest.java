import channel.Pay;
import channel.WxPay;
import channel.ZfbPay;
import mode.PayFaceMode;
import mode.PayFingerprintMode;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class PatternTest {
    private Logger logger = LoggerFactory.getLogger(PatternTest.class);


    /**
     * 桥接模式
     * 左侧 Pay 是⼀个抽象类，往下是它的两个⽀付类型实现；微信⽀付、⽀付宝⽀付。
     * 右侧 IPayMode 是⼀个接⼝，往下是它的两个⽀付模型；刷脸⽀付、指纹⽀付。
     * 那么， ⽀付类型 × ⽀付模型 = 就可以得到相应的组合。
     */
    @Test
    public void test_pay() {

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));

    }


}
