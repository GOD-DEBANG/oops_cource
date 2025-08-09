package introduction_to_package.pack;
//
//public class innerclass {
//
//
//    // the class that is not inside other class cannot be satatic , only inner class would be static
//    class test{
//        String name;
//
//
//        public test(String name) {
//            this.name = name;
//        }
// objects are created during Runtime and static metod or static obj has nothing to do with objects
// hence the static method or static object or whatever they called as class level method
// the class level method are resolved during Compiletime
//    } . method Binds instace veriable and instence method with reference variable
//    }
//
//    public static void main(String[] args) {
//        test a = new test(); //Error because the class test is itself dependent on outerclass (innerclass)
//        // if the class test would be outside innerclass then it will not be error as it will not depend on any object or classes
//        // we can keep it inside inner class by adding static method for zero error
//    }
//
////static class a{
////    // cant be static as it is outside the main class , as it not dependent on any other class
////}
public class innerclass{
    static class test{
        String name;
        public test(String name){
            this.name = name;
        }
           }

    public static void main(String[] args) {
        test a = new test("Debang");
        test b = new test("Kuswaha");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}