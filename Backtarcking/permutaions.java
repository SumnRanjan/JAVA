package Backtarcking;

public class permutaions {
    public static void main(String[] args) {
        boolean[] board = new boolean[4];
        bq(board, 2, 0, "", 0);
    }

    public static void bq(boolean[] board, int tq, int qpsf, String ans, int curr) {
        if (tq == qpsf) {
            System.out.println(ans);
        }

        for (int i = curr; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                bq(board, tq, qpsf + 1, "b" + i + "q" + qpsf, i + 1);
                board[i] = false;
            }
        }
    }
}
