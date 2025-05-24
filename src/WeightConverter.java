import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         double Weight;
         double NewWeight;
         int choice;

        System.out.println("Weight conversion Program");
        System.out.println("1 : Convert LBS to KG");
        System.out.println("2 : convert KG to LBS");

        System.out.print("choose an option ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter the Weight : ");
            Weight = sc.nextDouble();
            NewWeight = Weight * 0.4535924;
            System.out.println("the New Weight in kgs is : " +NewWeight);
        }
        else if(choice == 2){
            System.out.println("Enter the Weight");
            Weight = sc.nextDouble();
            NewWeight = Weight *2.204623;
            System.out.println("the New Weight in lbs is  %.2f: " +NewWeight);
        }
        else{
            System.out.println("Not a valid choice");
        }

        sc.close();
    }
}
