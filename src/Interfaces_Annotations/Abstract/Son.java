package Interfaces_Annotations.Abstract;

public  class Son extends Parent {

    public Son(int age) {
        super(32);

    }

    @Override
    void carrear() {
        System.out.println("I want to be CODDER");

    }

    @Override
    void partner() {
        System.out.println("I love CAT-WOMAN"  );

    }
    // giving error as Parent class  is an abstract class
    // solution is either make child class also abstract or make it override method
}
