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
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
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
