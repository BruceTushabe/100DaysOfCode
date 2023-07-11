public class Account {

    private double balance;

    public Account(double openingBalance) {
        balance = openingBalance;
    }

    public boolean rawWithdraw(double amount) {
        // Check if amount is greater than 0, throw an exception if not
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        if (balance >= amount) {
            balance -= amount;
            return true;
        }

        return false;
    }

    public void rawDeposit(double amount) {
        // Check if amount is greater than 0, throw an exception if not
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        balance += amount;
    }

    public double getRawBalance() {
        return balance;
    }

    public boolean safeWithdraw(double amount) {
        // Check if amount is greater than 0, throw an exception if not
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        synchronized (this) {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
        }

        return false;
    }

    public void safeDeposit(double amount) {
        // Check if amount is greater than 0, throw an exception if not
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        synchronized (this) {
            balance += amount;
        }
    }

    public double getSafeBalance() {
        synchronized (this) {
            return balance;
        }
    }
}

            


