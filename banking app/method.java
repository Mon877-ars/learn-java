import java.util.Scanner;
public class method {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // DECLARE VARIABLE
        double balance = 100;
        boolean isRunning = true;
        int choice;

        // DISPLAY MENU
        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            // GET AND PROCESS USER'S CHOICE
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit () ;
                case 3 -> balance -= withDraw(balance) ;
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        } 
        scanner.close(); 
        System.out.println("*****************************");
        System.out.println("Thank you for using our bank!");
    }  

    // SHOW BALANCE
    static void showBalance(double balance) {
        System.out.println("*****************");
        System.out.printf("Your balance is: $%.2f\n", balance); 
    }
    // DEPOSIT
    static double deposit () {
        double amount;

        System.out.print("Enter how many do you want to deposit: $");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Your amount cannot be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    //WITHDRAW
    static double withDraw (double balance) {
        double amount;
        System.out.print("Enter how many do you want to withdraw :$");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIEN FUNDS!!");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        }
        else {
            System.out.println("Withdraw successed");
            return amount;
        }
        
    }

}