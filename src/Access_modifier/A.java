package Access_modifier;

public class A { // public can be accesed every where
    int num; // as no public or private given , basically meance default acess modifier
    // the default modifier will give give error in different package
    // in same package there will be no error
    private int num1; // private data member, cannot be accessed directly outside this class
    // private data members are used for data hiding
    // private data members can only be accessed within the class
    protected int num2; // protected access modifier

    String name;
    int[] arr;
    public int getnum1(){ // getter method to access private data member num1
        // this method returns the value of num1
        // can be accessed in any class of the different package
        // can be acess in any class of the same package
        return num1;
    }
    public void setnum1(int num1){
        this.num1 = num1;
    }

    public A(int num, String name , int num2 , int num1){

        this.num = num;
        this.name = name;
        this.arr = new int[10];
        this.num1 = num1;
        this.num2 = num2;
    }
}
