import java.io.StringReader;
import java.util.Arrays;

public class Pascal {

        public static int[][] createPascal ( int numOfRows){
            int[][] triangle = new int[numOfRows][];


            for (int i = 1; i <= numOfRows; i++) {
                    triangle[i-1] = new int[i];
            }

            for (int i = 0; i < triangle.length; i++) {
                triangle[i][i] = 1;
                triangle[i][0] = 1;
            }

            for (int i = 0; i < triangle.length; i++) {
                for (int k = 1; k < i; k++) {
                    triangle[i][k] = triangle[i - 1][k] + triangle[i - 1][k - 1];
                }
            }
            return triangle;
        }


        public static void drawTriangle(int[][] triangle) {

            for (int x = 0; x < triangle.length; x++)
            {
                String spaces = "";
                    for (int i =0; i<(triangle[triangle.length-1].length - triangle[x].length)/2; i++) {
                        spaces += "  ";
                    }
                    String nums = "";
                    for (int j = 0; j < triangle[x].length; j++)
                    {
                        nums += triangle[x][j] + " ";
                    }
                    System.out.println(spaces + nums);
            }
               /* int format = triangle.length;
                String space = "";
                for (int x = 0; x < triangle.length; x++){
                    space+= " ";
                }
                int ctr = 1;
                for (int [] triangle1D: triangle){
                    if(space.length() != 0) {
                        space = space.substring(0, space.length() - ctr);
                    }
                    System.out.print(space);
                    for (int complete: triangle1D){
                        System.out.printf("%d ", complete);
                    }
                    System.out.println();
                    ctr++;
                    }*/
                }

    public static void main(String[]args) {
        drawTriangle(createPascal(11));
    }
}
