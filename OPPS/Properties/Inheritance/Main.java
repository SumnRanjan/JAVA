package OPPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(5.0 , 56.2 , 4.2);
//        Box box1 = new Box(box);
//        System.out.println(box.l + " " + box.w + " " + box.h);

//        BoxWeight box3 = new BoxWeight(50.5 , 60.8 , 80.4 , 99.2);
//        System.out.println(box3.l + " " + box3.w + " " + box3.h + " " + box3.weight);

//        Box box4 = new BoxWeight(2 , 3 , 4 , 6); //here parent reference child it is possible
//        System.out.println(box4.w);  // but we can't access weight here because parent class won't access child var

//        BoxWeight box5 = new Box();
        //In Java, a child class reference cannot refer to a parent class object because
        //the parent class does not have the additional properties or behaviors defined in the child class.



//        BoxPrices box = new BoxPrices(5 , 10 , 55);

        BoxPrices b = new BoxPrices(1 ,2 , 4 , 5 , 6 ,7);
        System.out.println(b.weightt);

        Box.greeting();

        BoxWeight box3 = new BoxWeight();
        BoxWeight.greeting(); // we inherit static method but we can not override it

        System.out.println(box.getL());

    }
}
