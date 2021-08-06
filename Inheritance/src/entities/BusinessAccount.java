package entities;

public final class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10;
        }
    }

    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
