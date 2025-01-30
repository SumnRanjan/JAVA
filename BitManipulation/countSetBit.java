package BitManipulation;
import java.util.*;

public class countSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int count = 0;
//
//        while(a > 0){
//            count += a & 1;
//            a = a>>1;
//        }
//
//        System.out.println(count);

        int cnt = 0;

        while (a != 0) {
            a = a & (a - 1);
            cnt++;
        }

        System.out.println(cnt);
    }

}
