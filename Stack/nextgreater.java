public class nextgreater {
    public static int solve(int[] arr, int tar, int k) {
        for (int i = k + 1; i < arr.length; i++) {
            if (arr[i] > tar) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 105, 102, 103, 98, 87, 100, 45 };
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = solve(arr, arr[i], i);
        }

        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
