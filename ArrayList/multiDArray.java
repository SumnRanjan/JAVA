package ArrayList;

import java.util.*;

public class multiDArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int row = 3;
            int col = 3;
            int [][] arr = new int[row][col]; //number of row is nec....

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // for (int i = 0; i < row; i++) {
            //     for (int j = 0; j < col; j++) {
            //         System.out.print(arr[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            // for(int i = 0 ; i < row ; i++){
            //     System.out.println(Arrays.toString(arr[i]));
            // }

            for(int [] a : arr){
                System.out.println(Arrays.toString(a));
            }
        }
    }
}
