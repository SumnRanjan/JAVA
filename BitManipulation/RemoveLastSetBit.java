package BitManipulation;

import java.util.Scanner;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int ans = a & (a-1);
        System.out.println(ans);
    }
}
