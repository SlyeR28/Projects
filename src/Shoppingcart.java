import java.util.Scanner;
public class Shoppingcart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item;
        int quantity;
        double price;
        char currency = '$';
        double total;
        double tax = 0.33;

        System.out.print("enter the item you want to buy ! ");
        item = scanner.nextLine();
        System.out.print("how many would you like to buy ? ");
        quantity = scanner.nextInt();
        System.out.print("the price of item you is : ");
        price = scanner.nextDouble();
        total = quantity * price + tax;

        System.out.println("\n you have order " +item + " " + quantity + "/s");
        System.out.println("the total price of your order is " + currency   +total);
        scanner.close();
    }
}
