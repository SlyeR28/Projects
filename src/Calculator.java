import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double a;
         double b;
         char Operator;
         double result = 0;
         boolean validOperation = true;

        System.out.print("enter the value of a : ");
        a = sc.nextDouble();

        System.out.print("enter the operator (+ , - , * , / , ^ ) : ");
        Operator = sc.next().charAt(0);

        System.out.print("enter the value of b : ");
        b = sc.nextDouble();

        switch (Operator){
            case '+' -> result = a + b ;
            case '-' -> result = a - b ;
            case '*' -> result = a * b ;
            case '/' -> {
                if(b == 0){
                    System.out.println("cannot divisible by zero");
                    validOperation = false;
                }
            }
            case '^' -> result = Math.pow(a , b);
            default -> {
                System.out.println("invalid operator! ");
                validOperation = false;
            }

        }
        if(validOperation){
            System.out.println(result);
        }

        sc.close();
    }
}
