package OPPS.ObjectCloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human suman = new Human(22 , "Suman Ranjan");
//        Human twin = new Human(suman);

        Human twin = (Human) suman.clone();
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 1000;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(suman.arr));
    }
}
