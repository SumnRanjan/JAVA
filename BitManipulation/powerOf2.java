package BitManipulation;

import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if((a & (a - 1)) == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
