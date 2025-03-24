import java.util.HashSet;
import java.util.Scanner;

public class rec {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int count = 0;

            for (int i = 0; i <= n - 4; i++) {
                HashSet<Character> set = new HashSet<>();
                for (int j = i; j < i + 4; j++) {
                    set.add(str.charAt(j));
                }

                if (set.size() == 4) {
                    count++;
                }
            }

            System.out.print(count);
        }
    }
}
