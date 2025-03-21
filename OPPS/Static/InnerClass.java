package OPPS.Static;

import OPPS.Access.A;

public class InnerClass extends A {
    public InnerClass(int num, String name) {
        super(num, name);
    }

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }


        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sum");
        Test b = new Test("Jake");

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(a);
//        InnerClass obj = new InnerClass(2 , "su");
//        System.out.println(obj.num);

    }

}
