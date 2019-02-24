public class PrimGenerator {

    public static void main(String[] args) {
        printPrims(0, 10);
    }

    public static void printPrims(int a, int b) {
        int results = 0;

        for (int i = a; i < b; i++) {
            if (isPrim(i)) {
                System.out.println(i);
                results++;
            }
        }

        System.out.println("Found " + results + " primes in the range of " + a + " to " + b + ".");
    }

    public static boolean isPrim(int p) {
        if (p == 0 | p == 1) return false;

        for (int i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }

        return true;
    }


}