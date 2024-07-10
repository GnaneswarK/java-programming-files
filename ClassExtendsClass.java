import java.util.*;

class Student1 {
    String Announcement;
    String Activities;

    public Student1() {
        Announcement = "Tommorowis an Holiday Due To Heavy Rain";
        Activities = "VolleyBallTournment";
        System.out.println("Announcement and Activities for Student1 " + Announcement + " & " + Activities);
    }

    public Student1(String Announcement, String Activities) {
        this.Announcement = Announcement;
        this.Activities = Activities;
        System.out.println("Announcement and Activities for Student1 " + Announcement + " & " + Activities);
    }

}

class Student2 extends Student1 {

    public Student2() {
        System.out.println("Announcement and Activities for Student2 " + Announcement + " & " + Activities);
    }

    Student2(String Announcement, String Activities) {
        super(Announcement, Activities);
        System.out.println("Announcement and Activities for Student2 " + Announcement + " & " + Activities);
    }
}

public class ClassExtendsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student1 student = new Student2();
        student = new Student2("VinayakaChevati Holiday", "KhoKhoGame");
        sc.close();
    }
}