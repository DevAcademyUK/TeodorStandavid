package bankingApp;

public class account {

    private double accoutBalance;
    private String accountType;

    public account(double accoutBalance, String accountType ) {
        this.accoutBalance = accoutBalance;
        this.accountType = accountType;
    }

    public void printBalance() {
        System.out.println("Your balance is: " + accoutBalance);
    }

    public void printType() {
        System.out.println("Account type: " + accountType);
    }

    public void deposit(double amount) {

        accoutBalance = accoutBalance + amount;
    }

    public void withdraw(double amount) {

        accoutBalance = accoutBalance - amount;

    }

}
