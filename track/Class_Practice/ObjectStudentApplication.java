package track.Class_Practice;

class Student {
    String name;
    int rollno;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class ObjectStudentApplication {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.rollno = 12;
        s1.name = "Raja";
        s1.height = 5.5;
        System.out.println("name : " + s1.name);
        System.out.println("rollno : " + s1.rollno);
        System.out.println("height : " + s1.height);
        s1.run();
        s1.sleep();

        s2.rollno = 13;
        s2.name = "Ravi";
        s2.height = 5.6;
        System.out.println("name : " + s2.name);
        System.out.println("rollno : " + s2.rollno);
        System.out.println("height : " + s2.height);
        s2.run();
        s2.sleep();

    }
}
