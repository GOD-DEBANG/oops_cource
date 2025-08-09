package introduction_to_package.pack;

public class main {
    public static void main(String[] args){
        human_class kuswaha = new human_class(22,"Debang Kuswaha" , 100000 , false);
        human_class kuswaha_debang = new human_class(24,"Default",1000000,true);
        System.out.println(human_class.population);
        System.out.println(human_class.population);
        main obj = new main();
        obj.gretings();
        //you cannot access non static stuff without referencing their instance in a static context

    }
    //something non static belongs to an object
    void gretings(){

    }
}
//the property of a class do not change for different object ,
// the class will be same or common for all object ,
// such properties that are not directly related to the properties is known as static
//non satatic belongs to an object and it cannot be run inside static constent

