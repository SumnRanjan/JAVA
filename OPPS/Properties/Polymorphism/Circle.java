package OPPS.Properties.Polymorphism;

public class Circle extends Shapes{

    //this will run when circle obj is created
    //hence it is overriding the parent method
    @Override // this is called annotation
    void area(){
        System.out.println("Area of Circle is Pie * r * r");
    }

}
