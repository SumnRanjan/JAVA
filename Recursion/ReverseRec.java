package Recursion;

public class ReverseRec {

    static int sum = 0;
    static void revNum(int n) {
        if (n == 0) {
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        revNum(n/10);

    }
    public static void main(String[] args) {
        revNum(1452);
        System.out.println(sum);
    }

}
