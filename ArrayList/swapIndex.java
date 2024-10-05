package ArrayList;

import java.util.Arrays;


public class swapIndex {
    public static void main(String[] args) {
        int [] arr = {1 , 4 , 5 , 9 , 40};
        swap(arr , 1 , 2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int [] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
