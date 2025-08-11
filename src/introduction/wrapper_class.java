package introduction;

public class wrapper_class {
    public static void main(String[] args){
        int c = 10;
        Integer num = 50; // wrapper class
        System.out.println(num);
        // This is a wrapper class , means Converting a primitive into an object
        // here num is an object
        // num objectifies Integer

        Integer a = 10;
        Integer b = 50; // It will not Swap as Integer is a Final keyword
        // Final prevents the constant from being modified a primitive datatype , it acts as a constant

        swap(a, b);
        System.out.println(a + " " + b);

        // moving this code inside main so it runs
        final a kuswaha_debang = new a();// It is permitted as it is non primitive datatype but it cant allow you to reasign
        kuswaha_debang.name = "Other_name";


    }

    static void swap(Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

// Separate top-level class
class a {
    final int num = 10; // Initialized directly, cannot be changed later , and cannot proceed without initialization
    String name;

    public a(String name){
        this.name = name;
    }

    a(){
        this("Debang_Kuswaha");
    }
}
