public class Dupledrome {

    public static boolean isDupledrome(String input) {
        if (input.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < input.length(); i += 2) {
                if(input.charAt(i) != input.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isDupledrome("hhaauuss"));

    }
}
