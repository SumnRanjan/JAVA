package ArrayList;

import java.util.*;

public class multiDList {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(sc.nextInt());
                }
            }

            System.out.println(list);
        }

        
    }
}
