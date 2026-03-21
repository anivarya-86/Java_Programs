package in;

public class BankAccount {

    private int accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void depositMoney(double money){
        if (money <= 0){
            System.out.println("Invalid Deposit");
        }else {
            balance += money;
        }

    }
    public double withdrawMoney(double money){
        if (money <= 0 ){
            System.out.println("Invalid Withdraw");

        }else {
            balance -=money;
        }
        return money;
    }

    public double getBalance() {
        return balance;
    }
}

