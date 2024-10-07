package Searching;

public class rangeSearch {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 77 , 40, 50, 70, 8, 9};
        int target = 9;

        int r1 = 1;
        int r2 = 6;

        int ans = LinearSearch(arr, target, r1, r2);
        System.out.println(ans);

    }

    static int LinearSearch(int[] arr, int target, int s, int e) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = s; i <= e; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

}
