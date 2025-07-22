import java.util.Random;
import java.util.Scanner;
public class Numberguesinggame {
    public static void main(String[] args) {
         // Number guessing Game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1 , 11);

        System.out.println("Number Guessing game : ");
        System.out.print("Guess a number between 1 - 10 : ");

        do{
            System.out.println("Enter the Guess");
            guess = scanner.nextInt();
            attempts ++;
        }while (guess != randomNumber);
        System.out.println("you have won");
    }
}
