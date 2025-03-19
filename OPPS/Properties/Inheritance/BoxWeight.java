package OPPS.Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(BoxWeight other){
        super(other); //it refers to parent because that what super do
        //When super(other); is used inside the BoxWeight copy constructor,
        // it calls the copy constructor of the parent class (Box).
        // This is done to ensure that all properties inherited from Box are correctly copied to
        // the new BoxWeight object.
        this.weight = other.weight;
    }

    public BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double w, double l, double h , double weight) {
        super(w, l, h); // it calls the parent constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }
}
