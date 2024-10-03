package 
Method;

import java.util.Arrays;

public class varArr {
    public static void main(String[] args) {
        fun(1,2,3,54,5,9,87);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
