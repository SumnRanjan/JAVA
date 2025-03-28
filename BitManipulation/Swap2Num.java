package BitManipulation;

import java.util.Scanner;

public class Swap2Num {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println("Before swap: a = " + a + ", b = " + b);
            
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            
            System.out.println("After swap: a = " + a + ", b = " + b);
        }
    }
}
