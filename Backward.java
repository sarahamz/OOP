public class Backward {
    public static void main(String[] args){
        System.out.println(reverseString("Uni"));
    }

    public static String reverseString(String str){
        String s = new String();

        for(int i = str.length() - 1; i >= 0 ; i --){
            s += str.charAt(i);
        } return s;
    }
}
