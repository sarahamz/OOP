import java.util.Random;

public class Faculty {
    public static void main (String[] args) {
        int result = 1;

        Random rng = new Random(  1);
        int number = rng.nextInt(  10);
        System.out.println(number);

        for(int i =1; 1 >= number; i++){
            //result = result * i;
            result *= i;
            System.out.println(i);
        }

        /*
        for(int i = 1; i <= 4; i++) {

           result *= i;
           System.out.println(i);
        }
        System.out.println(result);
        */
    }
}
