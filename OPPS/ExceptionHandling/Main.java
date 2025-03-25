package OPPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(divide(a ,b));
//            throw new Exception("just for fun");
//            String name = "suman";
//            if(name.equals("suman")){
//                throw new MyException("Name is Suman");
//            }
        } catch (ArithmeticException e) { // always write subclass first
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("this execute normal exception");
        }finally {
            System.out.println("I will always execute");
        }
    }

    public static int divide(int a , int b) throws ArithmeticException , Exception{
        if(b == 0){
            throw new ArithmeticException("O se Divide mat kar bhai");
        }
        return a / b;
    }
}
