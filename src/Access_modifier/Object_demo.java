package Access_modifier;

public class Object_demo {
    int num;

    public Object_demo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        // It gives a Number representation of an object
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // It basically meance every object is the instance of object class

        return super.equals(obj);
    }

    public Object_demo() {
        super();
    } // Get class object gets the instance of the Parent class(object_demo)
    //Get class cant be over ride as this is final
    //Get class is stored in the Heap

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Coverd later on
        return super.clone();
    }

    @Override
    public String toString() { // Already covered
        // It gives the string representation
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        //Already Coverd
        // It get called when Garbage collection Hits
        super.finalize();
    }
}
