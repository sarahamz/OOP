public class DualNumberChecker {

    public static boolean isDualNumber(String str) {
        char[] stringToArray = str.toCharArray();

        if (str == null || str.length() == 0)
            return false;

        for (char out : stringToArray) {
            for (int i = 0; i < str.length(); i++) {

                if (out != '0' && out != '1')
                    return false;
            }

        }return true;
    }
}