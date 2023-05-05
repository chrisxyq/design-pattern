import lombok.Data;

@Data
public abstract class Approver {
    /**
     * 下一个审批者
     */
    Approver approver;
    String   name;
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public Approver(Approver approver, String name) {
        this.approver = approver;
        this.name = name;
    }
}
