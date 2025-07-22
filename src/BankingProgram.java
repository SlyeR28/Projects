import java.util.Scanner;
public class BankingProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Balance = 10.99;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("**********");
            System.out.println("Banking Program");
            System.out.println("**********");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("**********");

            System.out.println("enter the choice (1-4): ");
            choice = sc.nextInt();

            switch (choice){
                case 1 -> showBalance(Balance);
                case 2 -> Balance = Balance + Deposit();
                case 3 -> Balance = Balance - withdraw(Balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

    }
    static void showBalance(double Balance){
        System.out.println("****************");
        System.out.printf("$%.2f\n" , Balance);
    }
    static double Deposit(){
        double amount;
        System.out.println("Enter the amount to be Deposited: ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextDouble();

        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }
        return amount;
    }
    static double withdraw(double Balance){
        double amount;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the to be Withdrawn: ");
        amount = sc.nextDouble();
        if(amount > Balance){
            System.out.println("INSUFFICIENT FUNDS");
        } else if (amount <0) {
            System.out.println("amount cant be negative");
        }
        return amount;
    }
}
