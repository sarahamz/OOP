import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        System.out.println("Please enter a number to calculate the factorial:");

        try {
            int factorial = scan.nextInt();
            System.out.printf("FactorialExperiment of %d is %d.", factorial, calculateFactorial(factorial));
        } catch (InputMismatchException e){
            System.out.println("Invalid Input!");
            e.printStackTrace();
        }
    }

    public static int calculateFactorial(int factorial){
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        return result;
    }
}
