/*1)	Create a base class BankAccount with methods like deposit() and withdraw(). Derive 
a class SavingsAccount that overrides the withdraw() method to impose a limit on the withdrawal 
amount. Write a program that demonstrates the use of overridden methods and proper access modifiers 
& return the details.
*/
class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;

    public SavingsAccount(double balance, double withdrawalLimit) {
        super(balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded. Limit is: " + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }
}
 class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(10000, 5000);
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(6000);  // Exceeds limit
        savingsAccount.withdraw(4000);  // Allowed
    }
}

/* Output 
ava BankAccountDemo 
Deposited: 2000.0, New Balance: 12000.0
Withdrawal limit exceeded. Limit is: 5000.0
Withdrawn: 4000.0, New Balance: 8000.0*/