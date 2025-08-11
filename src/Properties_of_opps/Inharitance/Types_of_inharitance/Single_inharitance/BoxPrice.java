package Properties_of_opps.Inharitance.Types_of_inharitance.Single_inharitance;


import Properties_of_opps.Inharitance.Superkeyword_privatekeyword.BoxWeight;

public class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice () {
        super();
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }

}