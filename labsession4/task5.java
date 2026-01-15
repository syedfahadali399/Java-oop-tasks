package labsession4;

class Account {
    String accountNumber;
    String accountHolderName;
    double balance;

    Account(String accNum, String accName) {
        this.accountNumber = accNum;
        this.accountHolderName = accName;
        balance = 0;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficent Funds");
        } else {
            this.balance -= amount;
        }
    }

    void getBalance() {
        System.out.println("Balance " + balance + "PKR");
    }

    void accountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance + "PKR");
    }

}

public class task5 {
    public static void main(String[] args) {

        Account holder1 = new Account("123456781", "Fahad");
        holder1.deposit(5000);
        holder1.getBalance();
        holder1.withdraw(2000);
        holder1.accountInfo();
        holder1.withdraw(3100);

    }
}