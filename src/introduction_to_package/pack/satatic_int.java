package introduction_to_package.pack;

public class satatic_int {
    static int a = 4;
    static int b;

    static{
        System.out.println("I sm an Static block");
        b = a*5;
    }

    public static void main(String[] args) {
        satatic_int obj = new satatic_int();

        System.out.println(satatic_int.a+" "+satatic_int.b);

        satatic_int.b = satatic_int.b+3;

        satatic_int obj2 = new satatic_int();
        System.out.println(satatic_int.a+" "+satatic_int.b);

    }
}
