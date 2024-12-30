package Recursion;

import java.util.*;

public class RecSubSeq {

    public static void printSubSeq(int[] arr, List<Integer> list, int i, int n) {
        if (i == n) {
            System.out.println(list);
            return;
        }

        list.add(arr[i]);
        printSubSeq(arr, list, i + 1, n);
        list.remove(list.size() - 1);
        printSubSeq(arr, list, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int n = 3;
        List<Integer> list = new ArrayList<>();
        printSubSeq(arr, list, 0, n);
    }
}
// leetcode 46