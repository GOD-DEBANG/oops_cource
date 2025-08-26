package Interfaces_Annotations.Interface_Class;

public class Car implements Engine , Brake {
    @Override
    public void brake() {
        System.out.println("I brake like a Normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start like a Normal Car");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a norma car ");

    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a normal car");

    }
    // Cn implement Multiple inheritance using implements keywords

}
