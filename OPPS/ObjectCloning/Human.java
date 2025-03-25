package OPPS.ObjectCloning;

import java.time.chrono.HijrahChronology;

public class Human implements Cloneable{
    int age;
    String name;
    int [] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {1 , 2 , 3 , 4 ,5};
    }
//
//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // this is shallow copy
//        // for Primitive it will copy
//        return super.clone(); // inherited from Object class
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // this is deep copy
        Human twin = (Human) super.clone(); // this actually a shallow copy

        //make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length ; i++) {
            twin.arr[i] = this.arr[i];
        }

        return  twin;
    }


}
