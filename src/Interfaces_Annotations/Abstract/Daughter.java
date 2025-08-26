package Interfaces_Annotations.Abstract;

public class Daughter extends  Parent {
    public Daughter(int age) {
        super(30);


    }

    @Override
        void carrear() {
            System.out.println("I want to be  a DOCTOR");

        }

        @Override
        void partner() {
            System.out.println("I love  IRON-MAN" );

        }
        // giving error as Parent class  is an abstract class
        // solution is either make child class also abstract or make it override method
    }


