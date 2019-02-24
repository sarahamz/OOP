public class printfStatements {
    public static void main(String[] args){
        int date = 07;
        int days = 123;
        String holidays = "Christmas";
        int a = 10;
        int b = 3;
        double c = 3.3333;

        System.out.println("Hello World!");
        System.out.printf("Today is the %dth of November.\n", date);
        System.out.printf("Only %d days left until %s.\n", days, holidays);
        System.out.printf("The result of %d divided by %d is: %f.\n", a, b, c);

    }
}
