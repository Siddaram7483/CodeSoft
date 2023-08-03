import java.util.Scanner;
public class Atm {

        private double balance;
        private String accountNumber;
        private String pin;

        public Atm (String accountNumber, String pin, double initialBalance) {
            this.accountNumber = accountNumber;
            this.pin = pin;
            this.balance = initialBalance;
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

        public double getBalance() {
            return balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public boolean validatePin(String enteredPin) {
            return pin.equals(enteredPin);
        }

        public static void main(String[] args) {
            // Sample usage of the ATM class
            Atm atm = new Atm("123456789", "1234", 1000.0);

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your account number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Enter your PIN: ");
            String enteredPin = scanner.nextLine();

            if (!accountNumber.equals(atm.getAccountNumber()) || !atm.validatePin(enteredPin)) {
                System.out.println("Invalid account number or PIN.");
                return;
            }

            System.out.println("Logged in successfully. Welcome!");

            while (true) {
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Your balance: " + atm.getBalance());
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }


