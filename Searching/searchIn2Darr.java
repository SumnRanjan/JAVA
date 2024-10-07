package Searching;

import java.util.Arrays;

public class searchIn2Darr {

    public static void main(String[] args) {
        int[][] arr = {
            {45, 56, 12},
            {1, 2, 3, 4},
            {12, 48, 80, 56},
            {222, 71}
        };

        int target = 12;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int Target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == Target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
