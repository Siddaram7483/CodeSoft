public class BankAccount {
        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount to deposit.");
            } else {
                balance += amount;
                System.out.println("Deposit successful. New balance: " + balance);
            }
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount to withdraw.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance. Cannot withdraw.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            }
        }

        public static void main(String[] args) {
            // Sample usage of the BankAccount class
            BankAccount account = new BankAccount("123456789", 1000.0);

            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Initial Balance: " + account.getBalance());

            account.deposit(500.0);
            account.withdraw(200.0);

            System.out.println("Final Balance: " + account.getBalance());
        }
    }


