package Interfaces_Annotations.Abstract;

public class main {
    public static void main(String[] args) {
        Son son = new Son(32);

        son.carrear();

        Daughter daughter = new Daughter(30);
        daughter.carrear();

        //Parent mom = new Parent(); // Give error as we cannot call object of abstract classes
        // to pass it you need to create override
        // abstract constructor also cant be created
        // abstract static method cant be created as static cannot be overridden
        // we can create static method in abstract classes
        Parent.hello();
        // abstract method needed to be extended for being overridden , due to this final abstract method is not available
           //Abstract function mean nobody of a function is allowed
        // variable in interface are static and final , mean cant be changed
        // variable declare in java interface they are by- default Final
        //Abstract can be both final and non-final
        // Abstract class can provide the implementation for the interface but interface cant provide implementation of abstract class
        // A class can implement more than one interfaces but cannot inherit multiple superclass
        // but interface can inherit multiple superclass
           }
}
