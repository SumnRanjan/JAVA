package OPPS.Properties.Inheritance;

public class BoxPrices extends BoxWeight{
    double cost;

    public BoxPrices(){
        super();
        this.cost = -1;
    }

    public BoxPrices(BoxPrices other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrices(double side , double weight , double cost){
        super(side ,weight);
        this.cost = cost;
    }

    public BoxPrices(double w, double l, double h, double weight , double cost) {
        super(w, l, h, weight);
        this.cost = cost;
    }
}
