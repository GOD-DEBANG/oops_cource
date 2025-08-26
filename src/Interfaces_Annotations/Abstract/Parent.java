package Interfaces_Annotations.Abstract;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void carrear();
    abstract void partner();


    static void hello(){
        System.out.println("Hello");

    }
}
