package ArrayList;

import java.util.Arrays;

public class revArr {
    public static void main(String[] args) {
        int [] arr = {1 , 4 , 5 , 9 , 40};
        reverse(arr , 5);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int [] arr , int n){
        int s = 0;
        int e = n - 1;

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
}
