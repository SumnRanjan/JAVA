package Recursion;

public class NumberRecu {

    public static void main(String[] args) {
        print(5);
        print1(5);
    }

    static void print(int n) {
        if (n == 0) {  //base condition
            return;
        }

        print(n - 1); //recursive call
        System.out.println(n);

        //tail recursion - last function call
    }

    //concept
    static void print1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(--n);  //n-- vs --n 
    }
}
