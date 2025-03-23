package OPPS.Interfaces.extendDem02;

public interface A {
    //static interface methods should always have a body
    // call via the interface name
    static void hello(){
        System.out.println("hello");
    }
    default void fun(){
        System.out.println("i am in a");
    }

    default void sum(){
        System.out.println(1);

    }
}
