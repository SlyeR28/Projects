import java.util.Scanner;

public class Reactangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length;
        double width;
        double area;

        System.out.print("enter the length of reactangle :");
        length = scanner.nextDouble();
        System.out.print("enter the width of reactangle :");
        width = scanner.nextDouble();

        area = length*width;
        System.out.println("the area given length and widht is " +area + "unit²");

        scanner.close();
    }
}
