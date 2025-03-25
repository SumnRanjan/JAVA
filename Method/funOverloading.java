package 
Method;

    public class funOverloading {
    public static void main(String[] args) {
        fun(15);
        fun("Suman");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a){
        System.out.println("Herer is Don" + a);
    }
}
