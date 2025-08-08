package introduction;
class students{
    String Name;
    int Rollno;
    float Marks;
    students (){
        this.Rollno = 10;
        this.Marks = 100f;
        this.Name = "Debang kuswaha";

    }
     void greeting(){
        System.out.println("Hello my name is "+ Name);

    }
    void marks(){
        System.out.println("My marks is " + Marks);
    }
    void changedname(String Nowname){
        Name = Nowname;
    }

}
public class oops1 {
    public static void main(String[] args){
        students student = new students();
        student.greeting();
        student.marks();
        student.changedname("Debang Chowdhury");

        student.greeting();

    }

}
