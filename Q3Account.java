package Account;
public class Account {
    private double balance;


    public Account() {
        balance = 0.0;
    }


    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            balance = 0.0;
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

      public static void main(String[] args) {
          System.out.println("account 1:");

        Account acc1 = new Account();
        acc1.deposit(1000);
        acc1.withdraw(300);
        acc1.displayBalance();

          System.out.println("account 2:");
        Account acc2 = new Account(2000);
        acc2.deposit(99);
        acc2.withdraw(95);
        acc2.displayBalance();
    }
}
