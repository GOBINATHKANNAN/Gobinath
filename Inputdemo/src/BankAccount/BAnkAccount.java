package BankAccount;

public class BAnkAccount {

    private String accountNumber="a1v2f33";
    private double balance=1000.00d;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance() {
        this.balance = balance;
    }

    public  void deposit(double amount)
    {
        balance = balance+amount;
        System.out.println("the balance after depositing "+ amount +" is :" + balance);
    }

    public void withdraw(double amount) {
        balance = balance-amount;
        System.out.println("the balance after withdrawing "+ amount +" is :" + balance);
    }
}

