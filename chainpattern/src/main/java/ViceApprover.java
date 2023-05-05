public class ViceApprover extends Approver {
    public ViceApprover(Approver approver, String name) {
        super(approver, name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 1000){
            System.out.println("被" + this.name + "处理");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
