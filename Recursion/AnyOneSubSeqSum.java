package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AnyOneSubSeqSum {
        private  static boolean anyOnesubseqSum(int [] arr , int i , List<Integer>list , int sum , int n , int s){
        if(i == n){
            if(s == sum){
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[i]);
        s += arr[i];
        if(anyOnesubseqSum(arr, i + 1, list, sum, n, s)){
            return true;
        }

        list.remove(list.size() - 1);
        s -= arr[i];

        if(anyOnesubseqSum(arr, i + 1, list, sum, n, s)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,1};
        int n = arr.length;
        int i = 0;
        int s = 0;
        int sum = 2;
        List<Integer>list = new ArrayList<>();
        anyOnesubseqSum(arr , i , list , sum , n , s);
    }
}
