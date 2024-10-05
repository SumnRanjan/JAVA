package ArrayList;

public class maxNum {
    public static void main(String[] args) {
        int [] arr = {1 , 4 , 5 , 9 , 40};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxValue = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
