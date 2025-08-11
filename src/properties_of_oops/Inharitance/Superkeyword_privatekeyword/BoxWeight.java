package properties_of_oops.Inharitance.Superkeyword_privatekeyword;


import java.util.ArrayList;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
    }

    //    @Override
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }

    protected BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    protected BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight , double g) {
        // used to initialise values present in parent class
        super(l, h, w ); // what is this? call the parent class constructor
//        System.out.println(super.weight);
        //calling parent class constructor
        //used to initialise the parent class constructor
        //The g will not be an error here as it is initializing oops1 constructor
        //when ever a subclass is needed to refer to the super class from which it has derived then we can use sper key word
        // The super key word call the constructor of the above class
        // We can use super keyword as a this key word but this will only acess the super class keywords
        System.out.println(super.h);
//if the super class also have a variable n  in that case you use this.
// specifically access n then you will use super.
        // the subclass neec parameter for supercvlass ,
        // but doesnot need parameter for thisclass
        //super class has no idea what base class contains
    }

    }

