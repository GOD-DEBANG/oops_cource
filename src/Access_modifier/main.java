package Access_modifier;

public class main {
    public static void main(String[] args) {
        A obj = new A(10, "Debang kuswaha" , 20 ,40 );
        // here we cannot access the data members directly because of security purposes ex obj.arr , because they are private internal data members,
        //but we can access by help of some constructor or method
        // Need to do few things
        //1. Access the data members
        //2. modify the data members
        // obj.num1 = 10; // This will cause an error because num1 is private , as it is data hiding
        // we can access with the help of getter and setter methods
        obj.getnum1(); // This will return the value of num1
        int n = obj.num2; // can be accessed in same package {protected modifier}
    }
}
