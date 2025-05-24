import java.util.Scanner;
/*
* @author rishabh kumar
* @version 1.0
* @since 2002
* */
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double Temperature;
         double NewTemperature;
         String unit;

        System.out.print("enter the temperature: ");
        Temperature = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        NewTemperature = (unit.equals("C")) ? (Temperature -32) * 5/9 : (Temperature* 9/5 ) + 32; /* using teranary operator
                                                                                                    for making the code shorter and clean
                                                                                                    or you can say we are terminating if-else statment */
         System.out.println("temperature is now converted to " +NewTemperature  +"°" + unit );

        sc.close();
    }
}
