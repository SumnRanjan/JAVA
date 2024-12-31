package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSeqSum {

    private static void subseqSum(int[] arr, int i, List<Integer> list, int sum, int n, int s) {
        if (i == n) {
            if (s == sum) {
                System.out.println(list);
            }
            return;
        }

        list.add(arr[i]);
        s += arr[i];
        subseqSum(arr, i + 1, list, sum, n, s); //pick
        list.remove(list.size() - 1);
        s -= arr[i];

        subseqSum(arr, i + 1, list, sum, n, s); //notpick

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2};
        int n = arr.length;
        int i = 0;
        int s = 0;
        int sum = 2;
        List<Integer> list = new ArrayList<>();
        subseqSum(arr, i, list, sum, n, s);
    }
}
