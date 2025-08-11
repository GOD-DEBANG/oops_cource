package Properties_of_opps.Polymorphisamn.types_of_polymorphisamn;

public class static_Polymorphisam {
    // Also called as compile polymorphism
    //This is achieved via method Overloading
    //  mean Same name but type Arguments and ordering and return type can be different
    //Ex - multiple constructor
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a , int b , int c){
        return a+b+c;

    }

    public static void main(String[] args) {
        static_Polymorphisam obj = new static_Polymorphisam();
        obj.sum(2,4);
        obj.sum(4,6,10);

    }

}
