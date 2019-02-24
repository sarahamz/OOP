import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random rng = new Random(1);
        int number = rng.nextInt(100) + 1;
        System.out.println("I am thinking about a Number. Can you guess which one it is?");
        Scanner keyboard = new Scanner(System.in);
        int keyboardNumber = keyboard.nextInt();


        while (true) {
            if (keyboardNumber > number) {
                System.out.println("This is not the Number I was thinking about. It is smaller. Try again!");
                keyboardNumber = keyboard.nextInt();
            } else if (keyboardNumber < number) {
                System.out.println("This is not the Number I was thinking about. It is bigger. Try again!");
                keyboardNumber = keyboard.nextInt();
            } else if (keyboardNumber == number){
                System.out.println("You got it! The Number I was thinking about is: " + number + ".");
                break;
            }
        }
    }
}
