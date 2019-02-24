public class Square {
    public static double[] square(double[] numbers) {

        double[] result = new double[numbers.length];
        for(int i=0; i < result.length; i++){
            result[i] = numbers[i]*numbers[i];
        }
        return result;
    }
}