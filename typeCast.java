import java.util.function.Function;
import java.util.Scanner;

public class typeCast {
    // static void functionName() {
        // to create a method to be reused
        // method = funciton
    // }
    static void randomNum( double num) {
            // first round numbers with one decimal

            double roundedNum = (int) num + (int) ((num % 1) * 2);
            System.out.println("Your rounded number is: " + roundedNum);
        }
    public static void main(String[] args) {
        // create an input listener
        Scanner input = new Scanner(System.in);

        double num1   = 18.24;
        double num2= 212.5;
        double num3= -5.3;
        double num4 = -25.77;
            
        
        System.out.println( (int) num1 + (int) ((num1 % 1) * 2));
        System.out.println( (int) num2 + (int) ((num2 % 1) * 2));
        System.out.println( (int) num3 + (int) ((num3 % 1) * 2));
        System.out.println( (int) num4 + (int) ((num4 % 1) * 2));

        System.out.println("Enter number");
        double userNum = input.nextDouble();
        randomNum(userNum);
        
}
}
