package track.Class_Practice.OOPS;

class Student1 {

    int rollNo;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student1 s = (Student1) obj;
        return this.rollNo == s.rollNo && this.name.equals(s.name);
    }

    public Student1(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo);
        System.out.println(name);
    }

}

public class OverrideObjectclassMethod {
    public static void main(String[] args) {
        Student1 s1 = new Student1(11, "Arjun");
        Student1 s2 = new Student1(12, "Raju");
        Student1 s3 = new Student1(11, "Arjun");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2)); // false

        System.out.println(s1.equals(s3)); // true (because we have overridden that method in Student1 class)
    }
}
