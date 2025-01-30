package BitManipulation;

import java.util.*;

public class DecimalToBInary {
    public static String convertTobinary(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            res.append(n % 2);
            n /= 2;
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            String str = convertTobinary(n);
            System.out.println(str);
        }
    }
}
