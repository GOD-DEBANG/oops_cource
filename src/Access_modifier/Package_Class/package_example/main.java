package Access_modifier.Package_Class.package_example;

import Access_modifier.A;

public class main {
    public static void main(String[] args) {
        A a = new A(10 , "Debang Kuswaha" , 20 , 40); // we have to initialize it before using it , if not initialised it will give error
        a.getnum1();
        //int o = a.num2; // cannot be accessed outside folders package
    }
// Private is for data can be used in same class
    // Default access modifier or no modifier is used when we don't want to use some variable outside the particular package
    // Protected I will use when I don't want my variables to be accessed outside the package,
    // but I only wanted to be accessed outside the package if it is in the subclass of this -
    // particular class where the variable is written
    // only the subclass can access the protected member of the base class when it is in different class / outside of package
    // When we want to access variable everywhere we use public

}
