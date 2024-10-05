package ArrayList;

import java.util.*;

public class arrayLists {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> list = new ArrayList<>(10);

            //add in list
            // list.add(10);
            // list.add(20);
            // list.add(30);
            // list.add(40);
            // list.add(50);
            // System.out.println(list.contains(50));
            // list.set(0, 99);
            // list.remove(2);
            for (int i = 0; i < 5; i++) {
                list.add(sc.nextInt());
            }

            for(int i = 0 ; i < 5 ; i++){
                System.out.println(list.get(i));
            }

            // System.out.println(list);

            

        }
    }
}
