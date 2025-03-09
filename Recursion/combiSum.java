package Recursion;

public class combiSum {
    public static void main(String[] args) {
        int [] arr = {2 , 6 , 8 , 10};
        combi(arr, 0, 10, "");
    }

    private static void combi(int [] arr , int curr , int target , String ans){
        if(curr == target){
            System.out.println(ans);
            return;
        }

        if(curr > target){
            return;
        }

        for(int i = 0 ; i < arr.length ; i++){
            combi(arr, curr + arr[i], target, ans + arr[i]);
        }
    }
}
