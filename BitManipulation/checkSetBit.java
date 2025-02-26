package BitManipulation;

import java.util.Scanner;

public class checkSetBit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int i = sc.nextInt();

            // left shit
            if((a & (1 << i)) != 0){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            //right shit
            if(((a >> i) & 1) == 1){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
        }
    }
}
