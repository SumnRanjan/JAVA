package Recursion;

public class CountSeqSum {

    private static int countsubseqSum(int[] arr, int i, int sum, int n, int s) {
        if (i == n) {
            if (s == sum) {
                return 1;
            }
            return 0;

        }

        s += arr[i];
        int l = countsubseqSum(arr, i + 1, sum, n, s);
        s -= arr[i];
        int r = countsubseqSum(arr, i + 1, sum, n, s);

        return l + r;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2};
        int n = arr.length;
        int i = 0;
        int s = 0;
        int sum = 2;
        int ans = countsubseqSum(arr, i, sum, n, s);
        System.out.println(ans);
    }
}
