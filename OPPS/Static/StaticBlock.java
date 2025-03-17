package OPPS.Static;

public class StaticBlock {
    static int a = 4;
    static int b ;

//  will  only run once , when the first obj is created i.e. when the class is loaded for the first time
    static {
        System.out.println("I am inside Static Block");
        b = a * 5;
    }


    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 5;
        System.out.println(StaticBlock.b    );

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
