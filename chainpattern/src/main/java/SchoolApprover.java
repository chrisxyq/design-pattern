public class SchoolApprover extends Approver{
    public SchoolApprover(Approver approver, String name) {
        super(approver, name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 10000){
            System.out.println("被" + this.name + "处理");
        }else{
            throw new RuntimeException("金额过大");
        }
    }
}
