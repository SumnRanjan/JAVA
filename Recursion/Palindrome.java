package Recursion;

public class Palindrome {

    static int revNum(int n) {
        int digit = (int) (Math.log10(n)) + 1; // count digit
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }

        int rem = n % 10;
        return rem * (int) (Math.pow(10, digit - 1)) + helper(n / 10, digit - 1);
    }

    static boolean palindrome(int n) {
        return n == revNum(n);
    }

    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
}
