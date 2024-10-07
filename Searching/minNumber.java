package Searching;

public class minNumber {
    public static void main(String[] args) {
        int[] arr = {4, 5, 77 , 40, 50, 70, 8, 9 , 1};
        System.out.println(minNum(arr));
    }

    static  int minNum(int [] arr){
        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
