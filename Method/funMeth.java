package 
Method;

public class funMeth {
    public static void main(String[] args) {
        greet(); 
        int result = add(5, 10); 
        System.out.println("The sum is: " + result);

        String message = getGreeting("Alice"); 
        System.out.println(message); 
    }

 
    static void greet() {
        System.out.println("Hello, welcome to the program!");
    }

   
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    
    static String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
