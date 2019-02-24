import java.util.Arrays;

public class MatrixHelper {
    public static boolean isMatrix(int[][] a) {
        boolean matrix = true;
        for (int i = 0; i < a[i].length; i++) {
            if (a[i].length != a[i+1].length)
                matrix = false;
            break;
        }
        return matrix;
    }

    public static int[][] entrywiseProduct(int[][] a, int[][] b) {
        int[][] c = null;
        if (isMatrix(a) == false || isMatrix(b) == false) {
            return null;
        }
        if (a.length == b.length && a[0].length == b[0].length) {
            c = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    c[i][j] = a[i][j] * b[i][j];
                }
            }
        }
        return c;
    }

    public static int[][] multScalar(int[][] a, int b) {
        int[][] c;
        if (!isMatrix(a)) {
            return null;
        }
        c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[0].length; k++) {
                c[i][k] = a[i][k] * b;
            }
        }
        return c;

    }

    public static int frobeniusInnerProduct(int[][] a, int[][] b) {
        int[][] c = entrywiseProduct(a, b);
        if (c == null) return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[0].length; k++) {
                sum += c[i][k];
            }
        }
        return sum;
    }

    public static int[][] mmult(int[][] a, int[][] b) {
        if (!isMatrix(a) || !isMatrix(b)) {
            return null;
        }
        if (a[0].length != b.length || a.length != b[0].length) {
            return null;
        }

        int m1 = a.length;
        int n1 = a[0].length;
        int m2 = b.length;
        int n2 = b[0].length;

        int[][] c = new int[m1][n2];
        for (int i = 0; i < m1; i++)
            for (int j = 0; j < n2; j++)
                for (int k = 0; k < n1; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
    }
}