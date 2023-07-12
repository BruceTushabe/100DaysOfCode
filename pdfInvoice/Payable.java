public class Payable {

    private double amount;

    public Payable(double amount){
        this.amount = amount;
    }    

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
}

public interface PayableInterface {

    public void makePayment();

}
