package Question;

import java.util.Scanner;

public class armStrongNum {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (isArmstrongNumber(num)) {
                System.out.println("is a Armstrong Number");
            } else {
                System.out.println("is not a ArmstrongNumber");
            }

            // for(int i = 100 ; i < 1000 ; i++){
            //     if(isArmstrongNumber(i)){
            //         System.out.print(i + " ");
            //     }
            // }
        }
    }

    static boolean isArmstrongNumber(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int m = temp % 10;
            sum += m * m * m;
            temp /= 10;
        }
        
        return sum == num;
    }
}
