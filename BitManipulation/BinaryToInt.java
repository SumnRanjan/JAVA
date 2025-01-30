package BitManipulation;

import java.util.Scanner;

public class BinaryToInt {
    public static int ConvertToInt(String str) {
        int n = str.length();
        int p2 = 1, num = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '1') {
                num += p2;
            }
            p2 = 2 * p2;
        }
        return num;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int ans = ConvertToInt(str);
            System.out.println(ans);
        }
    }
}
