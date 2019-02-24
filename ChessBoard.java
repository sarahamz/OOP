import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {

        String[][] board = new String[8][8];

        char letter;
        int number = 8;

        for (int i = 0; i < board.length; i++) {
            letter = 'A';
            for (int j = 0; j < board[i].length; j++) {
                String current = "";
                current += letter;
                current += number;
                board[i][j] = current;
                letter++;
            }
            number--;
        }
        for(String[] row : board){
            System.out.println(Arrays.toString(row));
        }
    }
}
