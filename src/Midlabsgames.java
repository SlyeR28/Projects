import java.util.Scanner;

public class Midlabsgames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String adjective1;
         String noun1;
         String adjective2;
         String verb1;
         String adjective3;

        System.out.print("enter the adjective(description) : ");
        adjective1 = scanner.nextLine();
        System.out.print("enter the noun (animal or person) : ");
        noun1 = scanner.nextLine();
        System.out.print("enter the adjective (description) : ");
        adjective2 = scanner.nextLine();
        System.out.print("enter a verb  end with -ing (acton) : ");
        verb1 = scanner.nextLine();
        System.out.print("enter the adjective (description) : ");
        adjective3 = scanner.nextLine();

        System.out.println("today i went to  a " + adjective1 + " zoo ");
        System.out.println("In an exibhit i saw " +noun1 + " .");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println(" i was " + adjective3 + "!");
        scanner.close();
    }
}

