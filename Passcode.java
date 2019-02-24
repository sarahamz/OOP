import java.util.Scanner;

public class Passcode {
    public static void main(String[] args) {

        int passcode = 1337;
        final int limit = 3;
        int tries = 0;

        System.out.println("Please insert Passcode:");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        while (x != passcode && tries < limit - 1) {
            tries++;
            System.out.println("Access denied! You have "+ (limit - tries) +" tries left.");
            System.out.println("Please insert Passcode:");
            x = input.nextInt();
        }

        if (x == passcode) {
            System.out.println("Access granted! The meaning of life is 42.");
        } else {
            System.out.println("Access denied!");
        }
    }
}
