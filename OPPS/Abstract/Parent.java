package OPPS.Abstract;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 93;
    }

    //we can do this
    static void hello(){
        System.out.println("Hello What's up");
    }

    void normal(){
        System.out.println("This is normal method");
    }

    abstract void career();
    abstract void partner();
}
