public class Test {
    public static void method(String s, char c, int l, int u){


        try {
            int count = 0;
            for (int i = l; i <= u; i++){
                if (s.charAt(i) == c)
                    count++;
            }
            System.out.println(count);
        }catch (NullPointerException e){
            System.out.println("No String found.");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Out of bounds.");
        }finally {
            System.out.println("Thank you.");
        }
    }
}
