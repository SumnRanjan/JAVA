package ArrayList;
import  java.util.*;

public class arrList {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            //arrys of primitve
            int n = sc.nextInt();
            int [] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i] + " ");
            }

            // System.out.println();

            // for (int num: arr) {
            //     System.out.print(num + " ");
            // }
            // System.out.println(Arrays.toString(arr));
        }

        
    }
}
