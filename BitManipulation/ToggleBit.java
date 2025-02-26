package BitManipulation;

import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int i = sc.nextInt();

            int ans = a ^ (1 << i);
            System.out.println(ans);
        }
    }
}
