package Access_modifier;

public class subclass extends A{
    public subclass(int num , String name , int num1 , int num2){
        super(num , name , num1 , num2);

    }
    //Subclass have no idea about subclass 1 and subclass2
    // With protected modifier in different packages you are only able to access it in subclass

    public static void main(String[] args) {
        subclass obj = new subclass(10,"Debang kuswaha" , 10 , 20);
            int n = obj.num2; // protected access modifier can act fine on subclass of same package
        }
    }
class subclass2 extends A {
    public subclass2(int num, String name, int num1, int num2) {
        super(num, name, num1, num2);

    }
    public static void main(String[] args) {
        subclass obj = new subclass(10,"Debang kuswaha" , 10 , 20);
        int n = obj.num2; // protected access modifier can act fine on subclass of same package
    }
}


