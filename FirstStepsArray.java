import java.util.Arrays;

public class FirstStepsArray {

    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers[0] = 2;
        numbers[1] = 44;

        int [] numbersLong = new int[5];
        numbersLong[0] = 2;
        numbersLong[1] = 44;

        for(int i = 0; i < numbersLong.length; i++){
            numbersLong[i] += 7;
        }

        int result = 0;

        for(int anumber : numbersLong){
            result += anumber;
        }

        System.out.println(result);
        System.out.println(Arrays.toString(numbersLong));

    }//END numbers
}//END class