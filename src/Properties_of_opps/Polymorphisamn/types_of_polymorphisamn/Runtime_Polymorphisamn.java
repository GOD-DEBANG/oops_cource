package Properties_of_opps.Polymorphisamn.types_of_polymorphisamn;

public class Runtime_Polymorphisamn {
    //Also known as Dynamic polymorphism
    //Achieved by Method overriding
    // if the type of reference variable is Parent class or super class but the object is of type subclass that's how overriding is done
    //in another way we can say over-riding  is done when the refence variable of the super class and which particular method is called that depends on object
    //Parent obj = new child();
    //here which method will be called is depends on the child(), this method is known as upcasting
//This is the full process how overriding work
// When a child class has a method name and all other things like parameter and return type in the method is same but
    //The body is different from it is known as overriding
// JAVA knows which class to ren by help of Dynamic method dispatch
    //Dynamic method dispatch is a mechanism to call to an overridden method is resolved at runtime rather than compile time
    //  when an overridden method is called through a super  class reference variable  for ex, Parent obj = new child();
    // Java determine which version of that method to call based on the type of the object at the time this calls happen hence this determination at runtime
int num;
public Runtime_Polymorphisamn(int num){
    this.num = num;
    //every class is inherited from object class

}
@Override
public String  toString(){ // this tostring and default tostring method are same so adding override annotation
    // It will not give any error as it is overriding
    return "Runtime_Polymorphisamn{"+
            // it will determine at runtime , the whole thing
            "num="+num+
            '}';
}
// W know final keyword is use to create constants but we can also use final keyword for prevent overriding
    //you annot override a final method , as a method like this that are declared as final can provide performance enhancement
//As compiler is free to inline the calls because compiler will know this method will not be overridden
    //as these things happen on runtime
    //so when a final method is called java compiler can copy the byte code directly with the compiling code of the calling method
    // hence implementing the overhead associated with this method called like which one to be resolved.
    //The dynamic method resolution it's happening at runtime that is when overriding actually select which one to be run hence it has also known as late binding
    // however since the final method cannot be overridden a call to one can be resolved at compile time only is called Early binding
    public static void main(String[] args) {
        Runtime_Polymorphisamn obj = new Runtime_Polymorphisamn(54);
        System.out.println(obj);
    }
    //Final keyword also help in to prevent inheritance
    //if the class is declared as final then it implicitly all of its methods as final too
    // static method mean the class that is not dependent on the object of any class
    //the static method of the child class will not get called instead of its Parent class method will call
    //as the obj of Parent class will run as it is static without any gtype of dependency of any other class
    //it can be inherited  but cant be over ride because the min class will always be called as it is not dependent on any object
// Overriding depends on object static method doesn't depend on objects so it cant be overridden
    // polymorphism doesn't applied on instance variable
}
