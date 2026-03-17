package Day10;

public class NQueens {
    static int N = 4; // size of the chessboard

    // Function to print the board
    static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Check if placing a queen at (row, col) is safe
    static boolean isSafe(int[][] board, int row, int col) {
        // Check this column on upper side
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    // Recursive function to solve N-Queens
    static boolean solveNQueens(int[][] board, int row) {
        // Base case: if all queens are placed
        if (row == N) {
            printBoard(board);
            return true;
        }

        boolean res = false;
        // Try placing queen in all columns of this row
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // place queen

                // Recur to place rest of the queens
                res = solveNQueens(board, row + 1) || res;

                // Backtrack: remove queen
                board[row][col] = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] board = new int[N][N];

        if (!solveNQueens(board, 0)) {
            System.out.println("No solution exists");
        }
    }
}
