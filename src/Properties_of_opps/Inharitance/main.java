package Properties_of_opps.Inharitance;

public class main {
    public static void main(String[] args) {
//        oops1 oops = new oops1();
//        System.out.println(oops1.l + "" + oops.h + "" + oops.w);
//        box weight box = new box weight();
//        System.out.println(box.weight);
        Box box5 = new boxweight(1,3,4,8,6);
        //here the type of reference variable that determine what can be accessed instead of object reference
        System.out.println(box5.w);
//        when a reference of a subclass object is assign to a super class object
//        you will be having to only those parts of objects that are referred in the super class

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

//        Box.greeting();
        boxweight box = new boxweight();
       boxweight.greeting(); // you can inherit but you cannot override

    }
    }

