package Recursion;

import java.util.ArrayList;

public class subSeq {

    public static void main(String[] args) {
        subset("", "abc");
        subsetAscii("", "abc");
        System.out.println(subsequence("", "abc"));
        System.out.println(subsequenceAscii("", "abc"));
    }

    static void subset(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));

    }

    static ArrayList<String> subsequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subsequence(p + ch, up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));

        left.addAll(right);
        return left;

    }

    static void subsetAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsetAscii(p + ch, up.substring(1));
        subsetAscii(p, up.substring(1));
        subsetAscii(p + " " + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subsequenceAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subsequenceAscii(p + ch, up.substring(1));
        ArrayList<String> second = subsequenceAscii(p, up.substring(1));
        ArrayList<String> third = subsequenceAscii(p + " " + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }

}
