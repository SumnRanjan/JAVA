package Recursion;

import java.util.ArrayList;

public class Dice {

    public static void main(String[] args) {
        dice("", 4);
        System.out.println(dice2("", 4));

        diceface("", 8, 8);
        System.out.println(dice2face("", 8 , 8));

    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static void diceface(String p, int target , int  face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceface(p + i, target - i , face);
        }
    }

    static ArrayList<String> dice2(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dice2(p + i, target - i));
        }

        return ans;
    }

    static ArrayList<String> dice2face(String p, int target , int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ans.addAll(dice2face(p + i, target - i , face));
        }

        return ans;
    }

}
