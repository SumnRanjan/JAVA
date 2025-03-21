package OPPS.Access;

import java.util.Objects;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num , float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        return this.num == ((ObjectDemo)o).num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, gpa);
    }

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "num=" + num +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(45 , 55.2f);
        ObjectDemo obj2 = new ObjectDemo(45 , 56.2f);

        // this will check address is same or not
        if(obj1 == obj2) {
            System.out.println("obj is equal to obj2");
        }

        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        System.out.println(obj1 instanceof Object);
        System.out.println(obj1.getClass().getName());

    }
}
