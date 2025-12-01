import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount acc1 = new BankAccount("A101", 500);
        BankAccount acc2 = new BankAccount("B202", 1200);

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Account Details");
            System.out.println("4 - Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            BankAccount current = acc1;

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double dep = input.nextDouble();
                    current.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double w = input.nextDouble();

                    if (w <= current.getBalance()) {
                        current.withdraw(w);
                    } else {
                        current.withdraw(w);
                        System.out.print("Borrow?: ");
                        char ans = input.next().charAt(0);

                        if (ans == 'Y' || ans == 'y') {
                            current.forceWithdraw(w);
                        } else {
                            System.out.println("Withdraw canceled.");
                        }
                    }
                    break;

                case 3:
                    current.accountDetails();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);


        System.out.println("\n--- Account ID Change Simulation ---");
        System.out.println("Old Account ID: " + acc1.getAccountID());

        acc1.setAccountID("NEW555");
        System.out.println("New Account ID: " + acc1.getAccountID());

    }
}
