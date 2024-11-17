package Recursion;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 4, 5};
        int target = 4;
        int i = 0;

        System.out.println(linearSearch(arr, target, i));
        linearSearchAll(arr, target, i);
        System.out.println(array.toString());
        ArrayList<Integer> list = new ArrayList<>();
        linearSearchAllList(arr, target, i, list);
        System.out.println(list.toString());
        System.out.println(linearSearchList(arr, target, i));
    }

    static int linearSearch(int[] arr, int target, int i) {
        if (arr[i] == target) {
            return i;
        }

        if (i == arr.length - 1) {
            return -1;
        }

        return linearSearch(arr, target, ++i);
    }

    static ArrayList<Integer> array = new ArrayList<>();

    static void linearSearchAll(int[] arr, int target, int i) {
        if (arr[i] == target) {
            array.add(i);
        }

        if (i == arr.length - 1) {
            return;
        }

        linearSearchAll(arr, target, ++i);
    }

    static void linearSearchAllList(int[] arr, int target, int i, ArrayList<Integer> array) {
        if (arr[i] == target) {
            array.add(i);
        }

        if (i == arr.length - 1) {
            return;
        }

        linearSearchAllList(arr, target, ++i, array);
    }

    static List<Integer> linearSearchList(int[] arr, int target, int i) {
        List<Integer> list = new ArrayList<>();

        if (i == arr.length - 1) {
            return list;
        }

        if (arr[i] == target) {
            list.add(i);
        }

        List<Integer> ansFrom = linearSearchList(arr, target, ++i);

        list.addAll(ansFrom);

        return list;
    }
}

//33. Search in Rotated Sorted Array
//81. Search in Rotated Sorted Array2