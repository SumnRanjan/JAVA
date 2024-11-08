package Recursion;

public class ReverseRec {

    static int sum = 0;

    static void revNum(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        revNum(n / 10);

    }

    static int revNum2(int n) {
        //sometimes you might need some additional variable
        //in the argument in that case , make helper function

        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;

        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    public static void main(String[] args) {
        revNum(123);
        int ans = revNum2(1452);
        System.out.println(ans);
    }

}
