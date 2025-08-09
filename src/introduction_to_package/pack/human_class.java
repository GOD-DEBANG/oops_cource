package introduction_to_package.pack;

public class human_class {
    int age;
    String name;
    int salary;
    boolean marraid;
   static long population; //static variable

    public human_class(int age , String name , int salary , boolean marraid){
        this.marraid = marraid;
        this.age = age;
        this.name = name;
        this.salary = salary;
        human_class.population = population+1;
    }
}