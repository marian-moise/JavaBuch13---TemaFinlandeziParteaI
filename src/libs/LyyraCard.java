package libs;

public class LyyraCard {

    private double balance;
    private double initialBalance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
        this.initialBalance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if (balance > 2.5) {
            this.balance = balance - 2.5;
        } else {
            this.balance = balance;
        }
    }

    public void payGourmet() {
        // write code here
        if (balance > 4) {
            this.balance = balance - 4;
        } else {
            this.balance = balance;

        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount < 0) {
            this.balance = initialBalance;
        } else if ((balance + amount) < 150) {
            balance = balance + amount;
        } else {
            balance = 150;
        }
    }
}
