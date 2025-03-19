package OPPS.Properties.Inheritance;

public class Box {
   private double l;
    double w;
    double h;

//    double weight;

    public Box (){
//        super();  //Object Class
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }


    public double getL() {
        return l;
    }

    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(double w, double l, double h) {
        this.w = w;
        this.l = l;
        this.h = h;
    }

    public Box(Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    static void greeting(){
        System.out.println("Hey Bro");
    }

    public void information(){
        System.out.println("Running this Box");
    }
}
