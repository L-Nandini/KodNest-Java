package track.Class_Practice.OOPS;

import java.util.Objects;

class Student2 {

    int rollNo;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student2 s = (Student2) obj;
        return this.rollNo == s.rollNo && this.name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }

    public Student2(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " " + name;
    }

    void display() {
        System.out.println(rollNo);
        System.out.println(name);
    }

}

public class OverrideHashcodeAndToSting {
    public static void main(String[] args) {
        Student2 s1 = new Student2(11, "Arjun");
        Student2 s2 = new Student2(12, "Raju");
        Student2 s3 = new Student2(11, "Arjun");

        Object s4 = new Student2(22, "Ravi");

        s1.display(); // 11 Arjun
        s2.display(); // 12 Raju
        s3.display(); // 11 Arjun

        System.out.println(s1); // 11 Arjun
        System.out.println(s2); // 12 Raju
        System.out.println(s3); // 11 Arjun

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // true

        System.out.println(s1.getClass()); // class track.Class_Practice.OOPS.Student2
        System.out.println(s4.getClass()); // class track.Class_Practice.OOPS.Student2
    }
}
