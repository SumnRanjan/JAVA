package OPPS.Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            list.add(i+1);
        }

//        list.forEach((item) -> System.out.println(item * 2));
//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        list.forEach(fun);

        Operation sum = (a , b) -> a + b;
        Operation pro = (a , b) -> a * b;
        Operation sub = (a , b) -> a - b;

        LambdaFunction calculator = new LambdaFunction();
        System.out.println(calculator.operate(5 , 6 , sum));
        System.out.println(calculator.operate(5 , 6 , pro));
        System.out.println(calculator.operate(5 , 6 , sub));
    }

    private int operate(int a , int b , Operation op){
        return op.operation(a ,b);
    }
}

interface Operation{
    int operation(int a , int b);
}
