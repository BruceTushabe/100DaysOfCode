public class PayableImpl implements Payable {

    private double amount;

    public PayableImpl(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void makePayment() {
        // Add your payment logic here
        System.out.println("Making payment of $" + amount);
    }

}
