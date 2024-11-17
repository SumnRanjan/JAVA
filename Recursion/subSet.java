package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetDublicate(arr);
        List<List<Integer>> ans1 = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        for (List<Integer> list : ans1) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }

    static List<List<Integer>> subsetDublicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;

        for (int i = 0; i < arr.length; i++) {
            s = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                s = e + 1;
            }
            e = outer.size() - 1;
            int n = outer.size();
            for (int j = s; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        return outer;
    }

}
