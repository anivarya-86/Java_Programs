package in;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("anivarya", 000212);
        account.depositMoney(1005);
        System.out.println(account.withdrawMoney(20));

    }
}
