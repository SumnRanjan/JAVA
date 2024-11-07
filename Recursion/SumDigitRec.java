package Recursion;

public class SumDigitRec {

    public static void main(String[] args) {
        int ans = sumDigit(125);
        int ans1 = digitPro(125);
        System.out.println(ans);
        System.out.println(ans1);
    }

    static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumDigit(n / 10);
    }

    static int digitPro(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * digitPro(n / 10);
    }

}
