public class CharWithinBounds {

        public String s;
        public char c;

        //smallest character in sting s
        public static char minChar (String s){
            char min = s.charAt(0);
            for (int i = 0; i < s.length(); i++)
                if (Character.isLetter(s.charAt(i)) && s.charAt(i) < min)
                    min = s.charAt(i);
            return min;
        }

        //biggest character in string s
        public static char maxChar (String s){
            char max = s.charAt(0);
            for (int i = 0; i < s.length(); i++)
                if (Character.isLetter(s.charAt(i)) && s.charAt(i) > max)
                    max = s.charAt(i);
            return max;
        }

        public static boolean charWithinBounds (char c, String s){
            if (s.length() == 0) {
                return false;
            }
            char min = minChar(s.toUpperCase());
            char max = maxChar(s.toUpperCase());

            c= (c+"").toUpperCase().charAt(0);
            return (c >= min) && (c <= max);
        }
}


