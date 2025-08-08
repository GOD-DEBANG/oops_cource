package introduction;
class student1 {
    float marks;
    int rollno;
    String name;


    student1(int rolno, String name, float marks) {
        this.rollno = rolno;
        this.name = name;
        this.marks = marks;
    }
    student1(student1 other){
        this.name = other.name;
        this.rollno = other.rollno;
    }
    student1() {
        this(13,"Default_person_name",200f);
    }

}

    public class oops2 {
        public static void main(String[] args) {
            student1 Kushwaha = new student1(20, "Debang Kuswaha", 200);
            System.out.println(Kushwaha.name);
            System.out.println(Kushwaha.marks);
            System.out.println(Kushwaha.rollno);
            student1 random = new student1(Kushwaha);
            System.out.println("The other student name is also : "+random.name);
            student1 random2 = new student1();
            System.out.println(random2.name);
            student1 one = new student1();
            student1 two = one;
            System.out.println(one.name);
            one.name = "Something";
            System.out.println(two.name);

        }
    }


