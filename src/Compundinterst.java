import java.util.Scanner;

public class Compundinterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int year;
        double amount;

        System.out.print("enter the principal amount : ");
         principal = sc.nextDouble();

        System.out.print("enter the interest rate (in %): ");
        rate = sc.nextDouble()/100;

        System.out.print("enter the # of times Compounded per year : ");
        timesCompounded = sc.nextInt();

        System.out.print("enter # the years: ");
        year = sc.nextInt();

        amount = principal*Math.pow(1+ rate/timesCompounded , timesCompounded);

        System.out.println("the amount of " +year + " is: $" +amount);

        sc.close();
    }
}