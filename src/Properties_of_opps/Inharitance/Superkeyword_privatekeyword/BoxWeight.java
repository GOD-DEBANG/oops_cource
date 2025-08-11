package Properties_of_opps.Inharitance.Superkeyword_privatekeyword;



import java.util.ArrayList;

public class BoxWeight extends properties_of_oops.Inharitance.Superkeyword_privatekeyword.Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    protected BoxWeight(BoxWeight other) {
        super(other.getL());
        weight = other.weight;
    }

    protected BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        // used to initialise values present in parent class
        super(l, h, w); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        this.weight = weight;
    }

}