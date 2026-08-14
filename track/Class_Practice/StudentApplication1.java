package track.Class_Practice;

class ObjectStudent {
    String name;
    int rollNo;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class StudentApplication1 {
    public static void main(String[] args) {

        ObjectStudent s1 = new ObjectStudent();
        ObjectStudent s2 = new ObjectStudent();

        s1.name = "Raja";
        s1.rollNo = 12;
        s1.height = 5.5;
        System.out.println("name : " + s1.name);
        System.out.println("rollno : " + s1.rollNo);
        System.out.println("height : " + s1.height);
        s1.run();
        s1.sleep();

        s2.name = "Ravi";
        s2.rollNo = 13;
        s2.height = 5.6;
        System.out.println("name : " + s2.name);
        System.out.println("rollno : " + s2.rollNo);
        System.out.println("height : " + s2.height);
        s2.run();
        s2.sleep();

    }
}
