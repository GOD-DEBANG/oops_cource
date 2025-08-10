package Properties_of_opps.Inharitance;

public class boxweight extends Box {
    double weight;

    public boxweight() {
        this.weight = -1;
//        this.g;//Cannot access as it is Private
    }

    public boxweight(double h, double l, double w, double weight, double g) {
        super(h, l, w, g); //calling parent class constructor
        //used to initialise the parent class constructor
        //The g will not be an error here as it is initializing oops1 constructor
        this.weight = weight;
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


