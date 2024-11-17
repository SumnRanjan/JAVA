package Recursion;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] numb, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;

        int mid = s + (e - s) / 2;
        int pivot = numb[mid];

        while (s <= e) {
            while (numb[s] < pivot) {
                s++;
            }

            while (numb[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = numb[s];
                numb[s] = numb[e];
                numb[e] = temp;
                s++;
                e--;
            }

            quickSort(numb, low, e);
            quickSort(numb, s, high);
        }
    }
}
