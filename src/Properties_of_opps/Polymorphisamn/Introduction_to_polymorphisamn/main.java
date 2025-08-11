package Properties_of_opps.Polymorphisamn.Introduction_to_polymorphisamn;

import Properties_of_opps.Polymorphisamn.Introduction_to_polymorphisamn.circle;
import Properties_of_opps.Polymorphisamn.Introduction_to_polymorphisamn.shapes;
import Properties_of_opps.Polymorphisamn.Introduction_to_polymorphisamn.square;
import Properties_of_opps.Polymorphisamn.Introduction_to_polymorphisamn.triangle;

public class main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        square square = new square();
        triangle triangle = new triangle();

        shapes.area();
    }
}
