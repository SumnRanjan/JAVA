package Backtarcking;
public class boardQun {
    public static void main(String[] args) {
        boolean [] board = new boolean[4];
        bq(board, 2 , 0, "");
    }

    public static void bq(boolean  [] board , int tq , int qpsf , String ans){
        if(tq == qpsf){
            System.out.println(ans);
        }

        for (int i = 0; i < board.length; i++){
            if(board[i] == false){
                board[i] = true;
                bq(board, tq, qpsf+ 1 , "b" + i + "q" + qpsf);
                board[i] = false;
            }
        }
    }
}


