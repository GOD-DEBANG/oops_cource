package Properties_of_opps.Polymorphisamn.Introduction_to_polymorphisamn;

public class circle extends shapes {
    //This will run when obj of circle is created
    //Hence it is overriding the parent method
    //@ overrides an annotation that used for check whether it is over ride or not
    // Type of method in overriding that is called is depending on what is the type of object is
     static void area(){
        System.out.println("I am in Shapes");
    }
}
