package introduction_to_package.pack;

public class singleton_class {
    private int num = 0;

    // Single instance (shared by everyone)
    private static singleton_class instance;

    // Private constructor to prevent outside instantiation
    private singleton_class() {
    }

    // Public method to get the single instance
    public static singleton_class getInstance() {
        if (instance == null) {
            instance = new singleton_class();
        }
        return instance;
    }


}
