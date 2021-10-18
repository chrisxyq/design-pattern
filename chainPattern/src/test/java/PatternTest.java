import javafx.scene.Parent;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.HashMap;

public class PatternTest {
    private Logger logger = LoggerFactory.getLogger(PatternTest.class);


    /**
     * 责任链模式
     * HandlerExecutionChain：职责链模式在springmvc的源码的应用分析
     */
    @Test
    public void test2() {
        final PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1000, 1);
        final SchoolApprover schoolApprover = new SchoolApprover(null, "SchoolApprover");
        final ViceApprover viceApprover = new ViceApprover(schoolApprover, "ViceApprover");
        final DepartApprover departApprover = new DepartApprover(viceApprover, "DepartApprover");
        departApprover.processRequest(purchaseRequest);

    }

}
