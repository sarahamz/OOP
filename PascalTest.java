import java.util.Arrays;

public class PascalTest {

        public static int[][] createPascal(int numOfRows) {
            int[][] triangle = new int[numOfRows][];

            for(int i = 1; i <= numOfRows; i++)
                triangle[i-1] = new int[i];

            return triangle;
        }

        public static void drawTriangle(int[][] triangle) {

            for(int i = 0; i < triangle.length; i++) {
                triangle[i][0] = 1;
                triangle[i][i] = 1;
            }

            for(int i = 1; i < triangle.length; i++) {
                for (int x = 1; x < i; x++) {
                    triangle[i][x] = triangle[i-1] [x-1] + triangle[i-1] [x];
                }
            }
            for(int i = 0; i < triangle.length; i++) {
                String line = format(triangle[i]);

                int space = ((format(triangle[triangle.length-1]).length() -1)+line.length())/2;

                System.out.printf("%"+(space > 0 ? space : "")+"s\n", line);
            }
        }

        private static String format(int[] array) {
            String line = "";
            for(int x = 0; x < array.length; x++) {
                line = line + array[x] + " ";
            }

            line = line.substring(0, line.length()-1);

            return line;
        }

        public static void main(String[]args) {
            drawTriangle(createPascal(10));
        }
    }