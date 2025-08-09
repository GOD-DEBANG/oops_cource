package introduction_to_package.pack;

// Singleton Class: A class that allows only one object to be created.
// It provides a global point of access to that single object.
public class private_small_glimpls {

    // constructor with new keyword creates an object
    // singleton_class obj = new singleton_class(); //  Not allowed, constructor is private

    // getInstance() gives the single shared object
    singleton_class obj = singleton_class.getInstance();
    // obj.num; // error as the num is private

    singleton_class new1 = singleton_class.getInstance();

    // all the three obj are pointing to just one obj
}
