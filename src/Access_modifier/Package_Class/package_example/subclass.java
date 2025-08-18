package Access_modifier.Package_Class.package_example;

import Access_modifier.A;

public class subclass extends A {
    public subclass(int num , String name , int num1 , int num2){
        super(num , name , num1 , num2);

    }

    public static void main(String[] args) {
        subclass obj = new subclass(10,"Debang kuswaha" , 10 , 20);
            int n = obj.num2; // protected acess modifier can act fine on subclass of same package
        }
    }
    // it can access subclass of different package {Protected Access modifier}

