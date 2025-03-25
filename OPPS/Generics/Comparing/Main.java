package OPPS.Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student suman = new Student(12 , 88.0f);
        Student ram = new Student(1 , 95.5f);
        Student anvil = new Student(1 , 93.5f);
        Student summit = new Student(1 , 92.5f);
        Student rahul = new Student(1 , 85.5f);

        Student [] list = {suman , ram , anvil , summit , rahul};
        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);
//        we can also do like this
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks - o2.marks); // if we want in desc order just do o2.marks - o1.marks
//            }
//        });
        Arrays.sort(list, (o1, o2) -> (int) (o1.marks - o2.marks)); // using lambda function

        System.out.println(Arrays.toString(list));

        if(suman.compareTo(ram) < 0){
            System.out.println("ram has more marks than suman");
        }
    }
}
