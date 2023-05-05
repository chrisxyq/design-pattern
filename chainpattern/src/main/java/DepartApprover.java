public class DepartApprover extends Approver {
    public DepartApprover(Approver approver, String name) {
        super(approver, name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 100){
            System.out.println("被" + this.name + "处理");
        }else{
            approver.processRequest(purchaseRequest);
        }
        //Match(purchaseRequest).of(
        //        // else if (bmi < 18.5)
        //        Case($(v -> v.getPrice() < 100), () -> "被"+this.name+"处理"),
        //        // else
        //        Case($(), () ->{
        //            approver.processRequest(purchaseRequest);
        //            return;
        //        })
        //);
    }
}
