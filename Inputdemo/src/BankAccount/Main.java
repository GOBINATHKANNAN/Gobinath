package BankAccount;

public class Main {
    public static void main(String[] args) {
            BAnkAccount bankAccount = new BAnkAccount();
            bankAccount.getAccountNumber();
            bankAccount.getBalance();
        System.out.println("Account number is : "+bankAccount.getAccountNumber());
        System.out.println("balance is : "+ bankAccount.getBalance());
        bankAccount.deposit(250.00);
        bankAccount.withdraw(250.00);
    }
}
