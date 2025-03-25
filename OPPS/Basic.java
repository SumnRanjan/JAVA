 package OPPS;

class Student {
    int roll;
    String name;
    float marks;

    // Default Constructor
    // Student() {
    //     this.name = "suman";
    //     this.roll = 1;
    //     this.marks = 95.7f;
    // }

    // Parameterized Constructor
    public Student(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    // Copy Constructor
    public Student(Student other) {
        this.roll = other.roll;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(){
        //call another constructor
        this(14, "sumit", 85.4f);
    }

    void changeName(String name) {
        this.name = name;
    }


    void greeting() {
        System.out.println("Hello Namaste " + this.name);
    }

    // @Override
    // protected  void finalize() throws  Throwable{
    //     System.out.println("obj destroy");
    // }
}

public class Basic {
    public static void main(String[] args) {
        // System.out.println("Hello");

        // Creating an object using Parameterized Constructor
        Student s1 = new Student(1, "sumi", 78.9f);
        System.out.println("Original Student:");
        System.out.println("Roll: " + s1.roll);
        System.out.println("Name: " + s1.name);
        System.out.println("Marks: " + s1.marks);

        // Creating a copy using the Copy Constructor
        Student s2 = new Student(s1);
        System.out.println("\nCopied Student:");
        System.out.println("Roll: " + s2.roll);
        System.out.println("Name: " + s2.name);
        System.out.println("Marks: " + s2.marks);

        // Changing name in original student to check if the copied object remains unchanged
        s1.changeName("lulu");
        System.out.println("\nAfter Changing s1 Name:");
        s1.greeting(); // Will print new name
        s2.greeting(); // Should still have the old name


        Student random = new Student();
        System.out.println(random.marks);


        final Student su = new Student(1,"suman" , 55.6f);
        su.name = "lo";
        System.out.println(su.name);

        // Student Sum;
        // for (int i = 0; i < 100000000; i++) {
        //     Sum = new Student(1 , "name" , 54.3f);
        // }
    }

}
