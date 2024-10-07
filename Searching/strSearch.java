package Searching;

public class strSearch {

    public static void main(String[] args) {
        String str = "suman";
        char target = 'm';

        boolean ans = searchStr(str, target);
        System.out.println(ans);

    }

    static boolean searchStr(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
