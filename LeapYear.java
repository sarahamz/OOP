import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        Scanner keyboard = new Scanner (System.in);
        int year = keyboard.nextInt ();

        if (year % 4 != 0){
            System.out.println("kein Schaltjahr");
        }else if (year % 4 == 0 && year != 0){
            System.out.println("ist Schaltjahr");
        }
    }
}
