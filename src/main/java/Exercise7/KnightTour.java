/*package Exercise7;

public class KnightTour {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        int[] horisontal = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
        int moveNumber = 0;
        int currentRow = 3;
        int currentColumn = 4;
        for (moveNumber = 0; moveNumber < 8; moveNumber++) {
            if ()
            currentRow += vertical[moveNumber];
            currentColumn += horisontal[moveNumber];
            ++board[currentRow][currentColumn];

        }
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board[i].length; j++)
                System.out.print(board[i][j] + "  ");
        }
    }
}
*/