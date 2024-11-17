package Recursion;

public class StrRemoveChar {

    public static void main(String[] args) {
        removeChar("", "baccha");

        System.out.println(removeChar2("baccha"));
        System.out.println(removeStr("bacchaappleach"));
        System.out.println(removeStr2("bacchaappeach"));
    }

    static void removeChar(String s, String v) {
        if (v.isEmpty()) {
            System.out.println(s);
            return;
        }

        char first = v.charAt(0);

        if (first == 'a') {
            removeChar(s, v.substring(1));
        } else {
            removeChar(s + first, v.substring(1));
        }
    }

    static String removeChar2(String v) {
        if (v.isEmpty()) {
            return "";
        }

        char first = v.charAt(0);

        if (first == 'a') {
            return removeChar2(v.substring(1));
        } else {
            return first + removeChar2(v.substring(1));
        }
    }

    static String removeStr(String v) {
        if (v.isEmpty()) {
            return "";
        }

        if (v.startsWith("apple")) {
            return removeStr(v.substring(5));
        } else {
            return v.charAt(0) + removeStr(v.substring(1));
        }
    }

    static String removeStr2(String v) {
        if (v.isEmpty()) {
            return "";
        }

        if (v.startsWith("app") && !v.startsWith("apple")) {
            return removeStr2(v.substring(3));
        } else { 
            return v.charAt(0) + removeStr2(v.substring(1));
        }
    }

}
